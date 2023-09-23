class Production implements Observer {
    @Override
    public void atualizar(double pressao, double vazao, double fluxo) {
        System.out.println("Iniciando produção com base nos seguintes valores:");
        System.out.println("Pressão: " + pressao + " | Vazão: " + vazao + " | Fluxo: " + fluxo);
        if (pressao < 100){
            System.out.println("Pressão aceitável, produção normal!");
        }else{
            System.out.println("Produção terá falhas pela pressão em excesso!!!");
        }
        if (vazao < 10000){
            System.out.println("Vazão aceitável, produção normal!");
        }else{
            System.out.println("Produção terá falhas pela vazão em excesso!!!");
        }
        if (fluxo < 100){
            System.out.println("Fluxo aceitável, produção normal!");
        }else{
            System.out.println("Produção terá falhas pelo fluxo em excesso!!!");
        }
    }
}
