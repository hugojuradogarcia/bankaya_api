package co.pokeapi.api.pokedex.dao.client;

import co.pokeapi.api.v2.pokemon.Pokemon;

public interface PokemonClient {
    Pokemon findPokemonByName(String name);
}
