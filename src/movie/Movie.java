package movie;

public class Movie {
	
	public String name;
	public Short duration;
	public String createdFrom;
	public Employer employer;
	public Genre genre;
	public Raiting raiting;
	
	public Movie(String name, Short duration, String createdFrom,
			Genre genre, Raiting raiting) {
		this.name = name;
		this.duration = duration;
		this.createdFrom = createdFrom;
		this.genre = genre;
		this.raiting = raiting;
	}
	
	public Movie(String name, Short duration, String createdFrom, 
			Employer employer, Genre genre, Raiting raiting) {
		this.name = name;
		this.duration = duration;
		this.createdFrom = createdFrom;
		this.employer = employer;
		this.genre = genre;
		this.raiting = raiting;
	}
}
