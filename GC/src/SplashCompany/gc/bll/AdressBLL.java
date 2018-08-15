package SplashCompany.gc.bll;

import SplashCompany.gc.model.Adress;

public class AdressBLL {

	Adress adress;

	public boolean validar(Adress adress) {

		if (adress.getCity() == null)
				//add exceptions
			return false;
		if (adress.getPublicPlace() == null)
			//add exceptions
		return false;
		if (adress.getComplement() == null)
			//add exceptions
		return false;
		if (adress.getNeighborhood() == null)
			//add exceptions
		return false;
		if (adress.getZipCode() == null)
			//add exceptions
		return false;
		if (adress.getCity() == null)
			//add exceptions
		return false;
		
		return true;

	}
	
	public void Persistir(Adress adress){
		boolean validacao = validar(adress);
		if(validacao == true){
			// persistir no banco
		}else{
			// excecao recorrente
		}
	}
}
