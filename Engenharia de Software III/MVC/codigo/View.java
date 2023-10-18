import java.util.List;

public interface View {
    void setC(Carta carta);
    void update(List<Carta> cartaList);
    void imprimirDadosSistema();
    void liberarCartaMotorista();
}
