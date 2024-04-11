import romano.caio.models.Musics;
import romano.caio.models.Podcasts;

public class Main {
	public static void main(String[] args) {
		Podcasts flow = new Podcasts();

		flow.setAuthorName("Igor");
		flow.setTitle("Flow Podcast");
		flow.setDuration(55);
		flow.setLikes(1253);
		flow.setStars(4.5);
		flow.setTotalReproductions(20543);

		flow.showDatasheet();
		flow.reproduce();
		flow.play();
		flow.pause();

		Musics music = new Musics();

		music.setGender("Rock");
		music.setTitle("Smell Like Teen Spirit - Nirvana");
		music.setDuration(4);
		music.setLikes(120953);
		music.setStars(4.9);
		music.setTotalReproductions(1020543);

		music.showDatasheet();
		music.reproduce();
		music.play();
		music.pause();
	}
}
