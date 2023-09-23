class Maintenance implements Observer {
    @Override
    public void atualizar(double pressao, double vazao, double fluxo) {
        System.out.println("Realizando manutenção com base nos seguintes valores:");
        System.out.println("Pressão: " + pressao + " | Vazão: " + vazao + " | Fluxo: " + fluxo);
        if (pressao > 100){
            System.out.println("Alta pressão no gasoduto! PERIGO!!!");
        }else{
            System.out.println("Pressão normal no gasoduto!");
        }
        if (vazao > 10000){
            System.out.println("Vazão grande no gasoduto! NECESSARIO EQUILIBRIO DE VOLUME!!!");
        }else{
            System.out.println("Vazão normal no gasoduto!");
        }
        if (fluxo > 100){
            System.out.println("Valor do fluxo em km/h no gasoduto muito alto! RISCO DE ACIDENTE POR ALTA VELOCIDADE DE DESLOCAMENTO DO GÁS!!!");
        }else{
            System.out.println("Fluxo normal no gasoduto!");
        }
    }
}