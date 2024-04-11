package romano.caio.models;

public class Audio {
	private String title;
	private int duration;
	private int totalReproductions;
	private int likes;
	private double stars;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTotalReproductions() {
		return totalReproductions;
	}

	public void setTotalReproductions(int totalReproductions) {
		this.totalReproductions = totalReproductions;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public double getStars() {
		return stars;
	}

	public void setStars(double stars) {
		this.stars = stars;
	}
}
