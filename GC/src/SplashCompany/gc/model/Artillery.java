package SplashCompany.gc.model;
import javax.persistence.*;

@Entity
public class Artillery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Player player;

	public Artillery(Player player) {
		super();

		this.player = player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
