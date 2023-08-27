public class Cliente implements Compra {
    private String nome;
    private String cpf;
    private Compra compra;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void fazerCompra() {
        if (compra != null) {
            System.out.println("Cliente: " + nome + " com CPF: " + cpf + " está fazendo uma compra:");
            compra.comprar();
        } else {
            System.out.println("Cliente: " + nome + " com CPF: " + cpf + " não selecionou um método de compra.");
        }
    }

    @Override
    public void comprar() {
        fazerCompra();
    }
}

