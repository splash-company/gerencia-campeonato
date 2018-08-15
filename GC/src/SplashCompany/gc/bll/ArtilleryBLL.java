package SplashCompany.gc.bll;
import SplashCompany.gc.model.Artillery;;

public class ArtilleryBLL {

	Artillery artillery;
	
	public boolean validar(Artillery artillery) {
		
		if (artillery.getPlayer() == null)
			//add exceptions
		return false;
		
		return true;

	}
	
	public void Persistir(Artillery artilery){
		boolean validacao = validar(artilery);
		if(validacao == true){
			// persistir no banco
		}else{
			// excecao recorrente
		}
	}
	
}
