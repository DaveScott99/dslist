package com.astro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astro.dslist.dto.GameListDTO;
import com.astro.dslist.entities.GameList;
import com.astro.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> list  = gameListRepository.findAll();
		return list.stream()
					.map(x -> new GameListDTO(x))
					.toList();
	}
	
	
}
