package co.pokeapi.api.pokedex.service;

import co.pokeapi.api.v2.pokemon.Abilities;
import co.pokeapi.api.v2.pokemon.HeldItems;
import co.pokeapi.api.v2.pokemon.Pokemon;

import java.util.List;

public interface PokemonService {
    Pokemon getPokemonByName(String name);
    List<Abilities> getAbilitiesPokemonByName(String name);
    int getBaseExperiencePokemonByName(String name);
    List<HeldItems> getHeldItemsPokemonByName(String name);
    int getIdPokemonByName(String name);
    String getNamePokemonByName(String name);
    String getLocationAreaEncountersPokemonByName(String name);
}
