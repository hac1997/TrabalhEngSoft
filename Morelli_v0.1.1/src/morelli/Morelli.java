/*
 * Versão 0.1.1 - Internacionalização
 */
package morelli;

import interfaceGrafica.AtorJogador;

import java.text.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;

/**
 *
 * @author Adriano Lima
 */
public class Morelli {

	public static void main(String args[]) {

		Locale currentLocale = Locale.getDefault();
//		Locale currentLocale = new Locale("pt", "BR");
//		Locale currentLocale = Locale.US;
		Locale vmLocale = Locale.getDefault(); // Locale da VM
		ResourceBundle bundle = ResourceBundle.getBundle(
				"mensagens/ApplicationMessages", currentLocale);

		DateFormat dateFormat = DateFormat.getInstance();
		NumberFormat numberFormat = NumberFormat.getInstance();

		AtorJogador jogador = new AtorJogador(bundle);

	}

}
