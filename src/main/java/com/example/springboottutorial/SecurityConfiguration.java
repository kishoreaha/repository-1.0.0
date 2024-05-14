package com.example.springboottutorial;

import jakarta.servlet.FilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration {
//
//    @Bean
////    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public SecurityFilterChain filterChainConfiguration(HttpSecurity http) throws Exception {
//        //All request Should be Authenticated
//        //If all Request Authenticated, Web Page will be displayed
//        //CSRF - POST/PUT
//
//        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
//        http.httpBasic(Customizer.withDefaults()); //PopUp instead of WebPage login for Authenticated Basic
//        http.csrf().disable();
//        return http.build();
//
//    }
//}
