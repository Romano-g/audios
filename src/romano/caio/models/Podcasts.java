package romano.caio.models;

public class Podcasts extends Audio implements Reproducible {
	private String authorName;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void showDatasheet() {
		System.out.printf("""
				------------------------------------------------
				Título do podcast: %s
				Autor: %s
				Vizualizações: %,d
				Avaliação: %.2f
				Likes: %,d
				Duração: %d minutos
				------------------------------------------------
				""", getTitle(), getAuthorName(), getTotalReproductions(),
				getStars(), getLikes(), getDuration());
	}

	@Override
	public void reproduce() {
		System.out.println("O podcast está reproduzindo: "  + getTitle());
	}

	@Override
	public void play() {
		System.out.println("O Podcast " + getTitle() + " deu play.");
	}

	@Override
	public void pause() {
		System.out.println("O Podcast " + getTitle() + " deu pause.");
	}
}
