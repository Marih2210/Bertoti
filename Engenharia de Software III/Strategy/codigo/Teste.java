public class Teste {
    public static void main(String[] args) {

        Compra compraAVista = new CompraAVista(100);
        Compra compraParcelada = new CompraParcelada(200, 3);

        Cliente cliente = new Cliente("Mariana", "123456789");

        // Sem selecionar um método de compra:

        cliente.fazerCompra();

        // Selecionando o método de compra à vista:

        cliente.setCompra(compraAVista);
        cliente.fazerCompra();

        // Selecionando o método de compra parcelada:

        cliente.setCompra(compraParcelada);
        cliente.fazerCompra();
    }
}

