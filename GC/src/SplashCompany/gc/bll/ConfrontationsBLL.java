package SplashCompany.gc.bll;

import SplashCompany.gc.model.Confrontations;

public class ConfrontationsBLL {

	public boolean validar(Confrontations confrontations) {

		if (confrontations.getTeam() == null)
			// add exceptions
			return false;

		return true;

	}

	public void Persistir(Confrontations confrontations) {
		boolean validacao = validar(confrontations);
		if (validacao == true) {
			// persistir no banco
		} else {
			// excecao recorrente
		}
	}
}