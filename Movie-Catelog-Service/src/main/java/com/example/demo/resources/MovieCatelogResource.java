package com.example.demo.resources;

import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CatelogItem;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogResource {

	@GetMapping("/{userId}")
	public java.util.List<CatelogItem> getCatelog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatelogItem("Titanic", "Love story", 4));
	}
}
