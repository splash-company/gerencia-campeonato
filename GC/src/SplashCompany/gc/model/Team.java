package SplashCompany.gc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamName;
	private TypeTeam typeTeam;
	
	public Team(String teamName, TypeTeam typeTeam) {
		this.teamName = teamName;
		this.typeTeam = typeTeam;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public TypeTeam getTypeTeam() {
		return typeTeam;
	}
	public void setTypeTeam(TypeTeam typeTeam) {
		this.typeTeam = typeTeam;
	}
	
	
}
