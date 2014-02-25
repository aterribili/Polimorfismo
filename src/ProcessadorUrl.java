public class ProcessadorUrl {
	private String dominio;

	public ProcessadorUrl(String dominio) {
		this.dominio = dominio;
	}

	public Site avaliaDominio() {
		if (dominio == "buscape")
			return new Buscape();
		if (dominio == "bondfaro")
			return new Bondfaro();
		throw new RuntimeException("Não foram encotrados registros");
	}
}
