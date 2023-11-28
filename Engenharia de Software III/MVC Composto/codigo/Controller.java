public class Controller {
    private Estoque estoque;

    public Controller(Estoque estoque) {
        this.estoque = estoque;
    }

    public void emitirCarta() {
        Carta carta = new CartaImpl();
        estoque.addSistema(carta);
    }

    public void liberarCartaMotorista() {
        List<Carta> encontrados = estoque.buscarSistema(new Sistema("ABC123", 2023));
        for (Carta sistema : encontrados) {
            if (sistema instanceof CartaMotorista) {
                ((CartaMotorista) sistema).setV(new ViewImpl());
            }
        }
        estoque.notifyObservers(encontrados);
    }
}
