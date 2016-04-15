package com.jin.spring.lesson08;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {
	@Autowired
	public MovieFinder movieFinder;

////    @Inject
//    public void setMovieFinder(@Named("main")MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }

}
