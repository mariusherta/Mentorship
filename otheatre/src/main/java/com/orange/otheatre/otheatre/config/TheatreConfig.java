/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orange.otheatre.otheatre.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@org.springframework.context.annotation.Configuration
@org.springframework.context.annotation.ComponentScan(value = {"com.orange.otheatre.*"})
@org.springframework.transaction.annotation.EnableTransactionManagement
public class TheatreConfig {
    


//    @Bean
//    public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
//
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(javax.persistence.EntityManagerFactory emf) {
//
//    }
}
