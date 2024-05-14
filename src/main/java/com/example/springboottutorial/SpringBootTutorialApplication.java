package com.example.springboottutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@EnableConfigServer
@SpringBootApplication
@Order(0)
//@RestController
//public class SpringBootTutorialApplication extends SpringBootServletInitializer {
public class SpringBootTutorialApplication implements CommandLineRunner, ApplicationContextAware {

    @Autowired
    @Qualifier("fooFormat")
    FooFormatter format;

    @Value("${spring.h2.console.enabled}")
    public boolean result;
//
//    @Value("${name}")
//    public String name;


    // This is Equivalent to assigning the variable like in traditional Java. Why we have to go this way ?
    //Answer: If we have this Property in property file ---> It will pick that(1st Priority). If not available, it will assign this value
    @Value("${name:Kishore}")
    public String name;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("EXECUTING : command line runner " + result + "--->>>" + name);


        for (int i = 0; i < args.length; ++i) {
            System.out.println(i + " " + args[i]);
        }



    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
//        FooFormatter format = (FooFormatter) applicationContext.getBean("FooFormatter.class");
        System.out.println("format.format() ----------->>> " + format.format());
        System.out.println("format.format() ----------->>> " + format.format2);

        List<String> names = Arrays.stream(format.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(FormatterType.class))
                .map(Field::getName)
                .collect(Collectors.toList());
        System.out.println(names);


        List<String> Classnames = Arrays.stream(new String[]{format.getClass().getName()})
                .filter(field -> field.getClass().isAnnotationPresent(FormatterType.class))
//                .map(Field::getD)
                .collect(Collectors.toList());
        System.out.println(Classnames);
        System.out.println("---------------->" + applicationContext.getBean(ScopeTesting.class));
        System.out.println("---------------->" + applicationContext.getBean(ScopeTesting.class));

        System.out.println("---------------->" + applicationContext.getBean(ScopeTesting.class));
    }

//    @GetMapping("/hello")
//    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }
//
//    public SecurityFilterChain filterChain(HttpSecurity http){
//        http.cs
//    }
}
