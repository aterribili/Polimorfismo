import org.junit.Assert;
import org.junit.Test;

public class DominioTest {

	@Test
	public void deveRetornarDominioBuscape() {
		Dominio dominio = new Dominio("buscape");

		Assert.assertEquals("http://www.buscape.com.br", dominio
				.AvaliaDominio().Dominio());
	}

	@Test
	public void deveRetornarParametroBuscape() {
		Dominio dominio = new Dominio("buscape");

		Assert.assertEquals("p", dominio.AvaliaDominio().Parametro());
	}

	@Test
	public void deveRetornarCookie() {
		Dominio dominio = new Dominio("buscape");

		Assert.assertEquals("bp", dominio.AvaliaDominio().Cookie());
	}

}
