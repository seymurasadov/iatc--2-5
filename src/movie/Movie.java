package movie;

public class Movie {
	
	public String name;
	public Short duration;
	public String createdFrom;
	public Employer employer;
	public Genre genre;
	public Raiting raiting;
	
	public Movie(String name, Short duration, String createdFrom) {
		this(name, duration, createdFrom, 
				new Employer("Leanardo", "DiKaprio", 51), new Genre(), new Raiting());
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
