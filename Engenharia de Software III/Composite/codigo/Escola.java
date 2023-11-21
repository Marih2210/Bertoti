import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Nota> notas;

    public Escola() {
        this.notas = new ArrayList<>();
    }

    public void lancar() {
        for (Nota nota : notas) {
            nota.lancar();
        }
        System.out.println("Notas lançadas com sucesso!");
    }

    public void lancarNotas(Nota nota) {
        this.notas.add(nota);
        System.out.println("Nota lançada.");
    }

    public List<Nota> getNotas() {
        return this.notas;
    }
}