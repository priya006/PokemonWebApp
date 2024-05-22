package com.pokemonwebapp.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig {

    @Bean
    fun webClient(): WebClient {
        return WebClient.builder().baseUrl("https://pokeapi.co/api/v2/").build()
    }
}