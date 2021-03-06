package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MovieReview;

@RestController
@RequestMapping("/reviews")
public class MovieReviewController {

	@GetMapping("/{movieId}")
	public MovieReview getMovieReview(@PathVariable("movieId") String movieId) {
		return new MovieReview(movieId,
				"Vintage love story, beautifully orchasterated, excellent direction, carefully crafted");
	}

}
