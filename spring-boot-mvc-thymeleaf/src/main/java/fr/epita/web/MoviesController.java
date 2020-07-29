package fr.epita.web;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.epita.datamodel.Movie;

@Controller
@RequestMapping("/movies")
public class MoviesController {
//	
//	@Autowired
//	MyMovieDAO dao;

	@GetMapping(value = "/list")
	public String displayMovies(Model model) {
		
		Movie movie1 = new Movie();
		movie1.setTitle("The Matrix");
		movie1.setReleaseDate(LocalDate.of(1997, 07, 01));
		
		model.addAttribute("moviesList", Arrays.asList(movie1));
		
		return "movies";
	}
	
}
