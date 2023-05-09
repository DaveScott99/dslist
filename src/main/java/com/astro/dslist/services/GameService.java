package com.astro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.dslist.entities.Game;
import com.astro.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll() {
		List<Game> games = gameRepository.findAll();
		return games;
	}
	
	
}
