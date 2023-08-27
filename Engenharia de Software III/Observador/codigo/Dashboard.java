class Dashboard implements Observer {
    @Override
    public void atualizar(double pressao, double vazao, double fluxo) {
        System.out.println("Dashboard atualizado: ");
        System.out.println("Pressão: " + pressao + " | Vazão: " + vazao + " | Fluxo: " + fluxo);
    }
}

