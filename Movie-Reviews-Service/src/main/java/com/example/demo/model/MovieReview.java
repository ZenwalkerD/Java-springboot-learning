package com.example.demo.model;

public class MovieReview {

	private String movieId;
	private String name;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieReview(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}

}
