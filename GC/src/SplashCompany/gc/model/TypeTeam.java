package SplashCompany.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum TypeTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	TIME_RANDOMICO, TIME_REAL;
}
