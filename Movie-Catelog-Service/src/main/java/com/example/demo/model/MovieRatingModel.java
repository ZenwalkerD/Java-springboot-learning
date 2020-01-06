package com.example.demo.model;

public class MovieRatingModel {

	private String movieId;
	private int rating;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MovieRatingModel(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public MovieRatingModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
