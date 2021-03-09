package co.pokeapi.api.pokedex.controller;

import co.pokeapi.api.pokedex.service.PokemonServiceImpl;
import co.pokeapi.api.v2.pokemon.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://pokeapi.co/api/v2/pokemon";

    @Autowired
    private PokemonServiceImpl pokemonServiceImpl;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPokemonRequest")
    @ResponsePayload
    public GetPokemonResponse getPokemon(@RequestPayload GetPokemonRequest request) {
        GetPokemonResponse response = new GetPokemonResponse();
        response.setPokemon(pokemonServiceImpl.getPokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilitiesPokemonRequest")
    @ResponsePayload
    public GetAbilitiesPokemonResponse getAbilitiesPokemon(@RequestPayload GetAbilitiesPokemonRequest request) {
        GetAbilitiesPokemonResponse response = new GetAbilitiesPokemonResponse();
        response.getAbilities().addAll(pokemonServiceImpl.getAbilitiesPokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperiencePokemonRequest")
    @ResponsePayload
    public GetBaseExperiencePokemonResponse getBaseExperiencePokemon(@RequestPayload GetBaseExperiencePokemonRequest request) {
        GetBaseExperiencePokemonResponse response = new GetBaseExperiencePokemonResponse();
        response.setBaseExperience(pokemonServiceImpl.getBaseExperiencePokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeldItemsPokemonRequest")
    @ResponsePayload
    public GetHeldItemsPokemonResponse getHeldItemsPokemon(@RequestPayload GetHeldItemsPokemonRequest request) {
        GetHeldItemsPokemonResponse response = new GetHeldItemsPokemonResponse();
        response.getHeldItems().addAll(pokemonServiceImpl.getHeldItemsPokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getIdPokemonRequest")
    @ResponsePayload
    public GetIdPokemonResponse getIdPokemon(@RequestPayload GetIdPokemonRequest request) {
        GetIdPokemonResponse response = new GetIdPokemonResponse();
        response.setId(pokemonServiceImpl.getIdPokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNamePokemonRequest")
    @ResponsePayload
    public GetNamePokemonResponse getNamePokemon(@RequestPayload GetNamePokemonRequest request) {
        GetNamePokemonResponse response = new GetNamePokemonResponse();
        response.setName(pokemonServiceImpl.getNamePokemonByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationAreaEncountersPokemonRequest")
    @ResponsePayload
    public GetLocationAreaEncountersPokemonResponse getLocationAreaEncountersPokemon(@RequestPayload GetLocationAreaEncountersPokemonRequest request) {
        GetLocationAreaEncountersPokemonResponse response = new GetLocationAreaEncountersPokemonResponse();
        response.setLocationAreaEncounters(pokemonServiceImpl.getLocationAreaEncountersPokemonByName(request.getName()));
        return response;
    }
}
