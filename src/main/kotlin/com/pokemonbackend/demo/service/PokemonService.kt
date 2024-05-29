package com.pokemonbackend.demo.service

import com.pokemonbackend.demo.model.Pokemon
import org.springframework.stereotype.Service


interface PokemonService {

    fun getPokemonDetails(name: String) : Pokemon
}