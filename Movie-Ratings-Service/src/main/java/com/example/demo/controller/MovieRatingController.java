package com.example.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieRatingModel;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {

	@GetMapping("/{movieId}")
	public List<MovieRatingModel> getRatings(@PathVariable("movieId") String movieId) {
		return Collections.singletonList(new MovieRatingModel(movieId, 5));
	}
}
