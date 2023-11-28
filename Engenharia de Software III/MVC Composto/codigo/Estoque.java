import java.util.ArrayList;
import java.util.List;

public class Estoque implements Subject {
    private List<Carta> sistema;
    private List<Observer> observers;

    public Estoque() {
        sistema = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addSistema(Carta sistema) {
        this.sistema.add(sistema);
    }

    public void buscarSistema(Carta sistema) {
    
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(List<Carta> encontrados) {
        for (Observer o : observers) {
            o.update(encontrados);
        }
    }
}
