package ma.ens.scolarite;

public class Categorie {
	private long id;
	private String code;
	private String libelle;
	private static long comp;
	

	public Categorie(String code, String libelle) {

		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

}
