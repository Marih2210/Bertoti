public class Teste{
    public static void main(String[] args) {
        ControleGasodutos controleGasodutos = new ControleGasodutos();

        Observer dashboard = new Dashboard();
        Observer maintenance = new Maintenance();
        Observer production = new Production();

        controleGasodutos.addObserver(dashboard);
        controleGasodutos.addObserver(maintenance);
        controleGasodutos.addObserver(production);

        double pressao = 900;
        double vazao = 9500;
        double fluxo = 80;

        controleGasodutos.setPressao(pressao);
        controleGasodutos.setVazao(vazao);
        controleGasodutos.setFluxo(fluxo);

        controleGasodutos.atualizacao();
    }
}

