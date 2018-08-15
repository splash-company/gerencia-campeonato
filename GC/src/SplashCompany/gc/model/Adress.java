package SplashCompany.gc.model;
import javax.persistence.*;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String publicPlace;
	@Column
	private String complement;
	@Column
	private String ZipCode;
	@Column
	private String neighborhood;
	@Column
	private String city;
	
	public Adress(String publicPlace, String complement, String zipCode, String neighborhood, String city) {
		super();
		this.publicPlace = publicPlace;
		this.complement = complement;
		ZipCode = zipCode;
		this.neighborhood = neighborhood;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
}
