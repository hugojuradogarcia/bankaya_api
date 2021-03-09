package co.pokeapi.api.pokedex.service;

import co.pokeapi.api.pokedex.dao.RequestRepository;
import co.pokeapi.api.pokedex.dao.client.PokemonClient;
import co.pokeapi.api.pokedex.model.commons.WebUtils;
import co.pokeapi.api.pokedex.model.entity.Request;
import co.pokeapi.api.v2.pokemon.Abilities;
import co.pokeapi.api.v2.pokemon.HeldItems;
import co.pokeapi.api.v2.pokemon.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonClient pokemonClient;

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private WebUtils webUtils;

    @Override
    public Pokemon getPokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name);
    }

    @Override
    public List<Abilities> getAbilitiesPokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getAbilities();
    }

    @Override
    public int getBaseExperiencePokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getBaseExperience();
    }

    @Override
    public List<HeldItems> getHeldItemsPokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getHeldItems();
    }

    @Override
    public int getIdPokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getId();
    }

    @Override
    public String getNamePokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getName();
    }

    @Override
    public String getLocationAreaEncountersPokemonByName(String name) {
        saveRequest(new Throwable()
                .getStackTrace()[0]
                .getMethodName());
        return pokemonClient.findPokemonByName(name).getLocationAreaEncounters();
    }
    
    private void saveRequest(String methodName) {
        requestRepository.save(new Request(webUtils.getClientIp(), methodName));
    }
}
