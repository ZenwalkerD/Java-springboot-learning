package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CatelogItem;
import com.example.demo.model.MovieRatingModel;
import com.example.demo.model.MovieReview;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public java.util.List<CatelogItem> getCatelog(@PathVariable("userId") String userId) {
		List<String> list = Arrays.asList("1");

		return list.stream().map(item -> {
			MovieReview reviews = restTemplate.getForObject("http://movie-review-service/reviews/" + item,
					MovieReview.class);
			MovieRatingModel[] ratings = restTemplate.getForObject("http://movie-rating-service/rating/" + item,
					MovieRatingModel[].class);
			return new CatelogItem("Titanic", reviews.getReview(), ratings[0].getRating());
		}).collect(Collectors.toList());

	}
}
