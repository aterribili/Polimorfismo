public class Dominio {
	private String dominio;

	public Dominio(String dominio) {
		this.dominio = dominio;
	}

	public Site AvaliaDominio() {
		if (dominio == "buscape")
			return new Buscape();
		if (dominio == "bondfaro")
			return new Bondfaro();
		throw new RuntimeException("Não foram encotrados registros");
	}
}
