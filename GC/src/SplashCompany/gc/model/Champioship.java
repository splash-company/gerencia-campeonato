package SplashCompany.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Champioship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private User user;
	private Player player;
	private TypeChampioship typeChampioship;
	private Artillery artillery;

	public Champioship(String name, String description, User user, Player player,
			TypeChampioship typeChampioship, Artillery artillery) {
		super();
		this.name = name;
		this.description = description;
		this.user = user;
		this.player = player;
		this.typeChampioship = typeChampioship;
		this.artillery = artillery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public TypeChampioship getTypeChampioship() {
		return typeChampioship;
	}

	public void setTypeChampioship(TypeChampioship typeChampioship) {
		this.typeChampioship = typeChampioship;
	}

	public Artillery getArtillery() {
		return artillery;
	}

	public void setArtillery(Artillery artillery) {
		this.artillery = artillery;
	}

}
