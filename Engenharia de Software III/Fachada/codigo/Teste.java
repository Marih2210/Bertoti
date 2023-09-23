public class Teste {
    public static void main(String[] args) {
        EcommerceFacade ecommerce = new EcommerceFacade();

        String cliente = "João";
        String[] itens = {"ProdutoA", "ProdutoB", "ProdutoC"};

        ecommerce.realizarPedido(cliente, itens);

        ecommerce.rastrearPedido(123);
    }
}