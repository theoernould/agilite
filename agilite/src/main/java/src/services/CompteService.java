package src.services;

import java.util.Map;
import java.util.Map.Entry;

import src.bdd.BDDBanque;
import src.compte.model.CompteDao;

public class CompteService {

	public CompteDao findCompteById(int id) {

		CompteDao foundCompte = null;

		for (Entry<Integer, CompteDao> compte : BDDBanque.getBddCompte().entrySet()) {
			if (compte.getKey() == id) {
				foundCompte = compte.getValue();
				break;
			}
		}

		return foundCompte;
	}

	public void addCompte(CompteDao compte) {
		BDDBanque.getBddCompte().put(BDDBanque.incrementAndGetIdCompte(), compte);
	}

	public Map<Integer, CompteDao> findAllCompte() {
		return BDDBanque.getBddCompte();
	}

	public void updateCompte(Integer id, CompteDao compte) {
		BDDBanque.getBddCompte().put(id, compte);
	}

	public void deleteCompte(Integer id) {
		BDDBanque.getBddCompte().remove(id);
	}
}