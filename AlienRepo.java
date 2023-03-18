package ai.thirdapp;

import org.springframework.data.jpa.repository.JpaRepository;

import ai.thirdapp.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
