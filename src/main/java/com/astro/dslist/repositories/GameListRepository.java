package com.astro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
