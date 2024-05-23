package com.pokemonbackend.demo

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
class PokemonController(private val pokemonService: PokemonService) {

    @GetMapping("/pokemon")
    fun search(): Mono<PokemonListResponse> {
        return pokemonService.searchPokemon()
    }
}