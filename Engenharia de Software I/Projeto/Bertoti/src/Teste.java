import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Sistema sistema = new Sistema();
		
		assertEquals(sistema.getClientes().size(), 0);
		
		sistema.cadastrarCliente(new Cliente("Mariana Veloso de Souza", new Consulta("2446655764", "Tratamento de Gengivite", "12/12/2022", "19 anos", "Feminino", "666777888999", "111222333444")));
		sistema.cadastrarCliente(new Cliente("Paulo Henrique Veloso de Souza", new Consulta("3344665789", "Tratamento de Cárie", "22/12/2022", "20 anos", "Masculino", "555666778890", "444555777899")));
	
		assertEquals(sistema.getClientes().size(), 2);
		
		Cliente clienteEncontrado = sistema.buscarClientePorNome("Paulo Henrique Veloso de Souza");
		
		assertEquals(clienteEncontrado.getConsult().getSexo(), "Masculino");
		
		List<Cliente> clientesEncontrados = sistema.buscarClientePorConsulta(new Consulta("2446655764", "Tratamento de Gengivite", "12/12/2022", "19 anos", "Feminino", "666777888999", "111222333444"));
	
		assertEquals(clientesEncontrados.get(0).getConsult().getSexo(), "Feminino");
	}

}
