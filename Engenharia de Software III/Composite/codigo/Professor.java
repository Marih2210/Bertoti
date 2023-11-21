public class Professor implements Nota {
    private String materia;
    private double notaMaxima;

    public Professor(String materia, double notaMaxima) {
        this.materia = materia;
        this.notaMaxima = notaMaxima;
    }

    @Override
    public void lancar() {
        this.notaMaxima = 10.0;
        System.out.println("Nota máxima para a disciplina " + this.materia + " lançada com sucesso.");
    }

    @Override
    public double getNota() {
        return this.notaMaxima;
    }
}