public class Teste {
    public static void main(String[] args) {
        Document file1 = new File("Documento1.txt");
        Document file2 = new File("Documento2.jpg");
        Document file3 = new File("Documento3.txt");

        Folder folder1 = new Folder("Minha Pasta");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Documentos Importantes");
        folder2.add(file3);

        folder1.add(folder2);

        folder1.open();
        folder1.print();

        file1.open();
        file1.save();
        file1.print();

        folder2.open();
        folder2.close();

        folder1.remove(file2);

        folder1.print();
    }
}