package SplashCompany.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Table {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Confrontations confrotations;
	private Champioship champioship;

	public Table(Confrontations confrotations, Champioship champioship) {
		super();
		this.confrotations = confrotations;
		this.champioship = champioship;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Confrontations getConfrotations() {
		return confrotations;
	}

	public void setConfrotations(Confrontations confrotations) {
		this.confrotations = confrotations;
	}

	public Champioship getChampioship() {
		return champioship;
	}

	public void setChampioship(Champioship champioship) {
		this.champioship = champioship;
	}

}
