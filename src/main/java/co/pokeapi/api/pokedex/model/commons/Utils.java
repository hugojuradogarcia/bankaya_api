package co.pokeapi.api.pokedex.model.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Utils {

    public static String pokeapiUrl;
    public static String pokeapiPokemonPath;
    public static String namespaceUri;

    @Value( "${pokeapi.url}" )
    public void setPokeapiUrl(String pokeapiUrl) {
        Utils.pokeapiUrl = pokeapiUrl;
    }

    @Value( "${pokeapi.pokemon.path}" )
    public void setPokeapiPokemonPath(String pokeapiPokemonPath) {
        Utils.pokeapiPokemonPath = pokeapiPokemonPath;
    }

    public final String POKEAPI_POKEMON_URL_COMPLETE(String name){
        return pokeapiUrl + pokeapiPokemonPath + name;
    }
}
