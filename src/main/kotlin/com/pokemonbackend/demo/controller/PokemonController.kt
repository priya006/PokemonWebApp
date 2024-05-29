package com.pokemonbackend.demo.controller

import com.pokemonbackend.demo.model.Pokemon
import com.pokemonbackend.demo.service.PokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemon")
class PokemonController @Autowired constructor(private val pokemonservice: PokemonService) {

    @GetMapping("{name}")
    fun getpokemonDetails(@PathVariable name : String) : Pokemon{
        return pokemonservice.getPokemonDetails(name)
    }

}