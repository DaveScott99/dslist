package com.astro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
