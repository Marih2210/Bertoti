import java.util.List;
import java.util.LinkedList;

public class Sistema {
	
	private List<Cliente> clientes = new LinkedList<Cliente>();
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> buscarClientePorConsulta(Consulta consult){
		List<Cliente> clientesEncontrados = new LinkedList<Cliente>();
		for(Cliente cliente: clientes) {
			if(cliente.getConsult().comparar(consult)) clientesEncontrados.add(cliente);
		}
		return clientesEncontrados;
	}
	
	public Cliente buscarClientePorNome(String nome) {
		for (Cliente cliente: clientes) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		return null;
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}
}
