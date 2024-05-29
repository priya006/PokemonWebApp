package com.pokemonbackend.demo.service

import com.pokemonbackend.demo.model.Pokemon
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate

@Service
class PokemonServiceImpl @Autowired constructor(private val restTemplate :RestTemplate) : PokemonService {
    override fun getPokemonDetails(name: String): Pokemon {
        //make the api call using restTemplate
        return try {
            val response = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/$name/", Pokemon::class.java)
            response ?: throw RuntimeException("Pokemon not found")
        } catch (exception: HttpClientErrorException) {
            throw RuntimeException("Pokemon not found",exception)
        }
    }
}