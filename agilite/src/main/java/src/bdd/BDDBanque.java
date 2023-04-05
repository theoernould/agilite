package src.bdd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import src.client.model.ClientDao;
import src.compte.model.CompteDao;
import src.compte.model.CompteOperationDao;
import src.compte.model.TypeCompte;

public class BDDBanque {

	static Map<Integer, ClientDao> instanceBDDClient = new HashMap<Integer, ClientDao>();
	static Map<Integer, CompteDao> instanceBDDCompte = new HashMap<Integer, CompteDao>();
	static int idCourantCompte = 0;
	static int idCourantClient = 0;
	static {

		instanceBDDClient.put(++idCourantClient, new ClientDao(idCourantClient, "Durand", "Jean", "53 rue des riches", "75000", "Paris", "0600000000", "jeandur@mail.com", Arrays.asList(1,2,3,4)));
		instanceBDDClient.put(++idCourantClient, new ClientDao(idCourantClient, "Dubois", "Gégé", "1 rue des pauvres", "69000", "Lyon", "0600000001", "aieMonEconomie@mail.com", Arrays.asList(5)));

		instanceBDDCompte.put(++idCourantCompte, new CompteDao(idCourantCompte, "Mon compte courant", new BigDecimal("100000000000"), TypeCompte.COMPTE_COURANT, new ArrayList<CompteOperationDao>()));
		instanceBDDCompte.put(++idCourantCompte, new CompteDao(idCourantCompte, "Ma maison surdimensionnée", new BigDecimal("1999999999990"), TypeCompte.CREDIT_IMMO, new ArrayList<CompteOperationDao>()));
		instanceBDDCompte.put(++idCourantCompte, new CompteDao(idCourantCompte, "Mon assurance parce que c'est rentable", new BigDecimal("15"), TypeCompte.ASSURANCE_VIE, new ArrayList<CompteOperationDao>()));
		instanceBDDCompte.put(++idCourantCompte,
				new CompteDao(idCourantCompte, "un dernier exemple", new BigDecimal("650000"), TypeCompte.PEL, Arrays.asList(new CompteOperationDao(1, "mon premier virement", new BigDecimal("650000"), null, null))));
		instanceBDDCompte.put(++idCourantCompte, new CompteDao(idCourantCompte, "Mon compte courant du pauvre", new BigDecimal("10,50"), TypeCompte.COMPTE_COURANT, Arrays.asList(new CompteOperationDao(2, "Oh non les impôts", new BigDecimal("5"), null, null))));
	}

	public static Map<Integer, ClientDao> getBddClient() {
		return instanceBDDClient;
	}

	public static Map<Integer, CompteDao> getBddCompte() {
		return instanceBDDCompte;
	}

	public static int incrementAndGetIdClient() {
		return ++idCourantClient;
	}

	public static int incrementAndGetIdCompte() {
		return ++idCourantClient;
	}
}
