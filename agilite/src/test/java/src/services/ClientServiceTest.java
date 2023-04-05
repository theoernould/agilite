package src.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

import src.client.model.ClientDao;

public class ClientServiceTest {

	private ClientService clientService = new ClientService();
	
	@Test
	public void testGetClient() {
		int idClientRecherche = 1;
		ClientDao client = clientService.findClientById(idClientRecherche);
		assertEquals(client.getId(), idClientRecherche);
		assertEquals(client.getNom(), "Durand");
	}

	@Test
	public void testGetAllClient() {
		Map<Integer, ClientDao> clients = clientService.findAllClient();
		assertEquals(clients.size(), 2);
	}

	@Test
	public void testUpdateClient() {
		ClientDao gegeModifie = new ClientDao(2, "Dubois", "Gégé", "1 rue des pauvres", "69000", "Lyon", "0600000001", "cestLaBanqueroute@mail.com", new ArrayList<Integer>());
		clientService.updateClient(2, gegeModifie);
		ClientDao client = clientService.findClientById(2);
		assertEquals(client.getMail(), "cestLaBanqueroute@mail.com");
	}

	@Test
	public void testAddClient() {
		ClientDao test = new ClientDao(3, "test", "test", "test rue des tests", "test", "test", "0600000002", "test@test.com", new ArrayList<Integer>());
		clientService.addClient(test);
		Map<Integer, ClientDao> clients = clientService.findAllClient();
		assertEquals(clients.size(), 3);
	}

	@Test
	public void testDeleteClient() {
		clientService.deleteClient(1);
		Map<Integer, ClientDao> clients = clientService.findAllClient();
		assertEquals(clients.size(), 1);
	}
}
