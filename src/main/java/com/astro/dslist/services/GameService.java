package com.astro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astro.dslist.dto.GameDTO;
import com.astro.dslist.dto.GameMinDTO;
import com.astro.dslist.entities.Game;
import com.astro.dslist.projections.GameMinProjection;
import com.astro.dslist.repositories.GameRepository;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		return games.stream()
					.map(x -> new GameMinDTO(x))
					.toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		return games.stream()
					.map(x -> new GameMinDTO(x))
					.toList();
	}
	
}
