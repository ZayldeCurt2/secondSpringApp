package myApp.service;


import myApp.dto.Pokemon;

public interface PokemonService {

    public String getString(String endPoint, String id);
    public Pokemon getPokemon(String endPoint, String id);



}
