package lbd2;

public class Movie {
	private String title;
	private String director;
	private String gender;
	private String year;
	
	public Movie () {
		
	}
	
	public Movie (String title, String director, String gender, String year) {
		this.title = title;
		this.director = director;
		this.gender = gender;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
