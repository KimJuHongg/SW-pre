package day0724;

import exercise.Singleton;

public class Movie {

	String movie_name, movie_director;
	
	public Movie(String n, String d) {
		this.movie_name = n;
		this.movie_director = d;
	}
	

	public void print() {
		System.out.print("{" + movie_name + "," + movie_director+ "} ");
	}
	
	@Override
	public String toString() {
		return "{" + movie_name + ", " + movie_director + "} ";
	}

}
