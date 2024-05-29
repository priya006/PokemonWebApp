package com.pokemonbackend.demo.service

import com.pokemonbackend.demo.model.Pokemon
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.ResourceAccessException
import org.springframework.web.client.RestTemplate

@Service
class PokemonServiceImpl @Autowired constructor(private val restTemplate :RestTemplate) : PokemonService {

    private val logger = LoggerFactory.getLogger(PokemonServiceImpl::class.java)

    override fun getPokemonDetails(name: String): Pokemon {
        //make the api call using restTemplate
        return try {
            val response = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/$name/", Pokemon::class.java)
            response ?: throw PokemonNotFoundExceprion("Pokemon not found")
        } catch (exception: HttpClientErrorException) {
           when(exception.statusCode){
               HttpStatus.NOT_FOUND ->{
                   logger.error("Pokemon not found")
               throw  PokemonNotFoundExceprion("Pokemondata not found")
               }
               HttpStatus.BAD_REQUEST ->{
                   logger.error("bad request")
                   throw PokemonBadRequest("The name has some issues")
               }
               else ->{
                    logger.error("Error fetching details $name")
                  throw PokemonBadRequest("bad name request", exception)
               }
           }
        } catch(resourceAccessException : ResourceAccessException){
            logger.error("Could not access the resource")
            throw PokemonServiceException("Unexcepted error ", resourceAccessException)
        }
    }
}



//Custom exceptions
class PokemonNotFoundExceprion(message: String, cause: Throwable? = null) : RuntimeException(message, cause)
class PokemonBadRequest(message: String, cause: Throwable? = null) : RuntimeException(message, cause)
class PokemonServiceException(message : String, cause : Throwable? = null) : RuntimeException(message, cause)