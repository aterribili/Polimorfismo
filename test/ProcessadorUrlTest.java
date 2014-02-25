import org.junit.Assert;
import org.junit.Test;

public class ProcessadorUrlTest {

	@Test
	public void deveRetornarDominioBuscape() {
		ProcessadorUrl processador = new ProcessadorUrl("buscape");

		Assert.assertEquals("http://www.buscape.com.br", processador
				.avaliaDominio().Dominio());
	}

	@Test
	public void deveRetornarParametroBuscape() {
		ProcessadorUrl processador = new ProcessadorUrl("buscape");

		Assert.assertEquals("p", processador.avaliaDominio().Parametro());
	}

	@Test
	public void deveRetornarCookie() {
		ProcessadorUrl processador = new ProcessadorUrl("buscape");

		Assert.assertEquals("bp", processador.avaliaDominio().Cookie());
	}

}
