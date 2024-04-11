package romano.caio.models;

public class Musics extends Audio implements Reproducible {
	private	String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void showDatasheet() {
		System.out.printf("""
				------------------------------------------------
				Faixa: %s
				Gênero: %s
				Vizualizações: %,d
				Avaliação: %.2f
				Likes: %,d
				Duração: %d minutos
				------------------------------------------------
				""", getTitle(), getGender(), getTotalReproductions(),
				getStars(), getLikes(), getDuration());
	}

	@Override
	public void reproduce() {
		System.out.println("A música sendo reproduzida: "  + getTitle());
	}

	@Override
	public void play() {
		System.out.println("A música " + getTitle() + " deu play.");
	}

	@Override
	public void pause() {
		System.out.println("A música " + getTitle() + " deu pause.");
	}
}
