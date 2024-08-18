package com.luv2code.springboot.cruddemo.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurtiConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails yatin = User.builder()
                .username("yatin")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails pradnya = User.builder()
                .username("pradnya")
                .password("{noop}test123")
                .roles("Employee", "MANAGER")
                .build();

        UserDetails ashwini = User.builder()
                .username("ashwini")
                .password("{noop}test123")
                .roles("Employee", "MANAGER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(yatin, pradnya, ashwini);
    }
}
