package chinook.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import chinook.data.GenreReposistory;
import chinook.model.Genre;

@Model
public class GenreController {
	
	@Inject
	private GenreReposistory genreRepository;
	
	private List<Genre> genres;
	
	@PostConstruct
	void init() {
		genres = genreRepository.findAll();
	}
	
	public List<Genre> getGenres() {
		return genres;
	}

}
