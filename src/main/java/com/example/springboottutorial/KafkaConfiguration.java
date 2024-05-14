package com.example.springboottutorial;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;



@Configuration

//@Order(1) //Low Priority for Command Line Runner
public class KafkaConfiguration //implements CommandLineRunner

{

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Hello World" + args[0]);
//    }
    @Bean

    public ProducerFactory<String, String> producerFactory()

    {

        Map<String, Object> config = new HashMap<>();



        //what is the kafka server name for consuming msg

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");

        //what type

        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        //value is json serializer//use json configuration

        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);



        return new DefaultKafkaProducerFactory<>(config);

    }



    @Bean

    public KafkaTemplate<String, String> kafkaTemplate() {

        return new KafkaTemplate<>(producerFactory());

    }





}


