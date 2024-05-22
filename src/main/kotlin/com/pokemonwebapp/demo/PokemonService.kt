package com.pokemonwebapp.demo


import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono


@Service
class PokemonService(private val webClient: WebClient) {
    private val logger = LoggerFactory.getLogger(PokemonService::class.java)


    fun searchPokemon(): Mono<PokemonListResponse> {
        return webClient.get()
            .uri("/pokemon")
            .retrieve()
            .bodyToMono(PokemonListResponse::class.java)
            .doOnNext { logger.info("Fetched Pokemon: $it") }
            .doOnError { logger.error("Error fetching Pokemon: ${it.message}") }


    }
}