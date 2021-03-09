package co.pokeapi.api.pokedex.dao.client;

import co.pokeapi.api.pokedex.model.commons.Utils;
import co.pokeapi.api.v2.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PokemonClientImpl implements PokemonClient {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private Utils utils;

    public Pokemon findPokemonByName(String name) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "poke api");
        HttpEntity<String> entity = new HttpEntity(headers);
        return restTemplate.exchange(
                        utils.POKEAPI_POKEMON_URL_COMPLETE(name),
                        HttpMethod.GET, entity, Pokemon.class).getBody();
    }
}
