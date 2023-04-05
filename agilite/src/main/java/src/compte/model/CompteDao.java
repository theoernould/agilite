package src.compte.model;

import java.math.BigDecimal;
import java.util.List;

public class CompteDao {

	private Integer id;
	private String name;
	private BigDecimal solde;
	private TypeCompte typeCompte;
	private List<CompteOperationDao> historiqueOperations;

	public CompteDao(Integer id, String name, BigDecimal solde, TypeCompte typeCompte, List<CompteOperationDao> historiqueOperations) {
		super();
		this.id = id;
		this.name = name;
		this.solde = solde;
		this.typeCompte = typeCompte;
		this.historiqueOperations = historiqueOperations;
	}

	public CompteDao() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSolde() {
		return solde;
	}

	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}

	public List<CompteOperationDao> getHistoriqueOperations() {
		return historiqueOperations;
	}

	public void setHistoriqueOperations(List<CompteOperationDao> historiqueOperations) {
		this.historiqueOperations = historiqueOperations;
	}

	public TypeCompte getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "CompteDao [id=" + id + ", name=" + name + ", solde=" + solde + ", typeCompte=" + typeCompte + ", historiqueOperations=" + historiqueOperations + "]";
	}

}
