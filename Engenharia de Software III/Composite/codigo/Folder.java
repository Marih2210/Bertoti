import java.util.ArrayList;
import java.util.List;

class Folder extends Document {
    private List<Document> documents = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void open() {
        System.out.println("Abrindo a pasta " + name);
    }

    @Override
    void save() {
        System.out.println("Salvando a pasta " + name);
    }

    @Override
    void close() {
        System.out.println("Fechando a pasta " + name);
    }

    @Override
    void print() {
        System.out.println("Imprimindo a pasta " + name);
    }

    void add(Document document) {
        documents.add(document);
    }

    void remove(Document document) {
        documents.remove(document);
    }

    Document getChild(int index) {
        return documents.get(index);
    }
}
