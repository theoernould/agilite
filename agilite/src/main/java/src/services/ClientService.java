package src.services;

import java.util.Map;

import src.bdd.BDDBanque;
import src.client.model.ClientDao;

public class ClientService {
	
	public ClientDao findClientById(int id) {
		return BDDBanque.getBddClient().get(id);
	}

	public void addClient(ClientDao client) {
		BDDBanque.getBddClient().put(BDDBanque.incrementAndGetIdClient(), client);
	}

	public Map<Integer, ClientDao> findAllClient() {
		return BDDBanque.getBddClient();
	}

	public void updateClient(Integer id, ClientDao client) {
		BDDBanque.getBddClient().put(id, client);
	}

	public void deleteClient(Integer id) {
		BDDBanque.getBddClient().remove(id+1);
	}
}
