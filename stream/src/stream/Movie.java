package stream;

public class Movie {

	private String name;
	private int year;
	private String actor;

	public Movie(String name, int year, String actor) {
		this.name = name;
		this.year = year;
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie{" + "name='" + name + '\'' + ", year=" + year + ", actor='" + actor + '\'' + '}';
	}

}
