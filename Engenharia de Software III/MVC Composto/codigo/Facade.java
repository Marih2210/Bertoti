public class Facade {
    private Estoque estoque;
    private Controller controller;
    private List<View> views;

    public Facade() {
        estoque = new Estoque();
        controller = new Controller(estoque);
        views = new ArrayList<>();
    }

    public void addView(View view) {
        views.add(view);
        estoque.registerObserver(view);
    }

    public void emitirCarta() {
        controller.emitirCarta();
    }

    public void liberar() {
        controller.liberarCartaMotorista();
    }
}