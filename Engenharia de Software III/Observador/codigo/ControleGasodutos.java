import java.util.ArrayList;
import java.util.List;
public class ControleGasodutos {
    private double pressao;
    private double vazao;
    private double fluxo;
    private List<Observer> observers = new ArrayList<>();

    public void atualizacao() {
        for (Observer observer : observers) {
            observer.atualizar(pressao, vazao, fluxo);
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public void setVazao(double vazao) {
        this.vazao = vazao;
    }

    public void setFluxo(double fluxo) {
        this.fluxo = fluxo;
    }

}
