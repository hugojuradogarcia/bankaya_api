package co.pokeapi.api.pokedex.dao.repository;

import co.pokeapi.api.pokedex.model.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
}
