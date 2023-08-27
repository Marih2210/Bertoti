public class CompraAVista implements Compra {
    private int pagarAVista;

    public CompraAVista(int pagarAVista) {
        this.pagarAVista = pagarAVista;
    }

    @Override
    public void comprar() {
        System.out.println("Compra à vista no valor de: " + pagarAVista);
    }
}
