package com.pokemonbackend.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class Config {

    @Bean
    fun getConfig() :RestTemplate{
        return RestTemplate()
    }
}