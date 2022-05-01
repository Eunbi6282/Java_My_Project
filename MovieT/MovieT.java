package MovieT;

public class MovieT {
	private String movieName;
	private String director;
	private int grade;
	private String genre;
	
	public MovieT(String movieName, String director, int grade, String genre) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "��ȭ ������ " + movieName + ", ������ " + director + ", ����� " + grade + ", �帣�� " + genre + "�Դϴ�. ";
	}

}
