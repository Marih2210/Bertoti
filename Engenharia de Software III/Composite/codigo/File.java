class File extends Document {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    void open() {
        System.out.println("Abrindo o arquivo " + name);
    }

    @Override
    void save() {
        System.out.println("Salvando o arquivo " + name);
    }

    @Override
    void close() {
        System.out.println("Fechando o arquivo " + name);
    }

    @Override
    void print() {
        System.out.println("Imprimindo o arquivo " + name);
    }
}