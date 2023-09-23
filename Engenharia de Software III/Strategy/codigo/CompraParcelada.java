public class CompraParcelada implements Compra {
    private  int valor;
    private int numeroParcelas;

    public CompraParcelada(int valor, int numeroParcelas) {
        this.valor = valor;
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public void comprar() {
        System.out.println("Compra parcelada em: " + numeroParcelas + " vezes. Valor total a ser dividido: " + valor + " Valor das parcelas: " + (valor/numeroParcelas));
    }
}
