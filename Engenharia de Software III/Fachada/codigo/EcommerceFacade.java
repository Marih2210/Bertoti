class EcommerceFacade {
    private Estoque estoque;
    private Pagamento pagamento;

    public EcommerceFacade() {
        estoque = new Estoque();
        pagamento = new Pagamento();
    }

    public void realizarPedido(String cliente, String[] itens) {
        System.out.println("Pedido realizado por: " + cliente);

        for (String item : itens) {
            if (estoque.verificar(item)) {
                System.out.println("Adicionando " + item + " ao pedido.");
            } else {
                System.out.println("Item " + item + " não está disponível no estoque.");
            }
        }

        double total = calcularPreco(itens);
        int pedidoId = 123;

        pagamento.efetuarPagamento(pedidoId, total);
        enviarEmailConfirmacao(cliente, pedidoId);
    }

    public void rastrearPedido(int pedidoId) {
        System.out.println("Pedido #" + pedidoId + " está em trânsito.");
    }

    private double calcularPreco(String[] itens) {
        double total = 0;
        return total;
    }

    private void enviarEmailConfirmacao(String cliente, int pedidoId) {
        System.out.println("Enviando email de confirmação para: " + cliente);
    }
}
