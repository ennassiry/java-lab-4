package ma.ens.scolarite;

public class Article {
	private long id;
	private String code;
	private String designation;
	private static long comp;
	private Categorie catgories;

	public long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCatgories() {
		return catgories;
	}

	public void setCatgories(Categorie catgories) {
		this.catgories = catgories;
	}

	public Article(String code, String designation, Categorie catgories) {

		this.id = ++comp;
		this.code = code;
		this.designation = designation;
		this.catgories = catgories;
	}

	@Override
	public String toString() {
		return "Article " + id + ", code=" + code + ", designation=" + designation + ", catgories="
				+ this.catgories.getLibelle();
	}

}
