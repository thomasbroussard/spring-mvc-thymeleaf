package fr.epita.datamodel;


import java.time.LocalDate;

public class Movie {
	
	private String title;
	private LocalDate releaseDate;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


}
