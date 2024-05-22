package com.pokemonwebapp.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PokemonController(private val pokemonService: PokemonService) {

    @GetMapping("/pokemon")
    fun search(): Mono<PokemonListResponse> {
        return pokemonService.searchPokemon()
    }
}