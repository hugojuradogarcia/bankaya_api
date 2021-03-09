# Bankaya SOAP web service
SOAP Web Service que consume la API rest https://pokeapi.co/ (Web Service with Spring Boot)

## Spring Boot - SOAP WS

## Getting started
### Prerequisites:
- Java 8
- Maven
- Postgres

## Structure of the code ##
    Package
        - Api 
            - web (CONTROLLER, CONFIG FILES)
            - dao (REPOSITORY)
            - model (MODEL, ENTITY & UTILS)
            - service (LOGIC BUSSINES)


## Generate packaging (WAR) for deploy into server
```
$ mvn update
$ mvn clean install 
```

## Authors
* **Hugo Jurado García** - *Repository* - [Pokedex](https://github.com/hugojuradogarcia/bankaya_api/commits/dev)