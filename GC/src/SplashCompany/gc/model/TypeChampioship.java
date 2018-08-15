package SplashCompany.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum TypeChampioship {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	MATA_MATA, PONTOS_CORRIDOS;
}
