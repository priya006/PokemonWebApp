package com.pokemonbackend.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.servlet.config.annotation.CorsRegistry


@Configuration
class WebClientConfig   {

    @Bean
    fun webClient(): WebClient {
        return WebClient.builder().baseUrl("https://pokeapi.co/api/v2/").build()
    }

    fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000") // Adjust this to your React app's URL
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("*")
            .allowCredentials(true)
    }
}