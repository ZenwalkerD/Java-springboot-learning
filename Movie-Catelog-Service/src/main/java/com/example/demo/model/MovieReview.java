package com.example.demo.model;

public class MovieReview {

	private String movieId;
	private String review;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public MovieReview(String movieId, String review) {
		super();
		this.movieId = movieId;
		this.review = review;
	}

	public MovieReview() {
		super();
		// TODO Auto-generated constructor stub
	}

}
