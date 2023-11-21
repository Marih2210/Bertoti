public class Aluno implements Nota {
    private String nome;
    private double notaObtida;
    private int matricula;

    public Aluno(String nome, double notaObtida, int matricula) {
        this.nome = nome;
        this.notaObtida = notaObtida;
        this.matricula = matricula;
    }

    @Override
    public void lancar() {
        this.notaObtida += 1.0;
        System.out.println("Nota do aluno " + this.nome + " lançada com sucesso.");
    }

    @Override
    public double getNota() {
        return this.notaObtida;
    }
}