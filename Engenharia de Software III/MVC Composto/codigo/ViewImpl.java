public class ViewImpl implements View {
    private Carta carta;

    @Override
    public void setC(Carta carta) {
        this.carta = carta;
    }

    @Override
    public void update(List<Carta> cartaList) {
        System.out.println("Atualização na View com as cartas: " + cartaList);
    }

    @Override
    public void imprimirDadosSistema() {
        if (carta instanceof Sistema) {
            Sistema sistema = (Sistema) carta;
            System.out.println("Sistema encontrado: " + sistema.getLicenca() + " - " + sistema.getAno());
        }
    }

    @Override
    public void liberarCartaMotorista() {
        if (carta instanceof CartaMotorista) {
            System.out.println("Carta do motorista liberada!");
        }
    }
}
