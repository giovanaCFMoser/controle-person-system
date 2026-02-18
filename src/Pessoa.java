public class Pessoa {
    String firtName;
    String lastName;
    int age;
    String document;

    public Pessoa(String firtName, String lastName, int age, String document) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.age = age;
        this.document = document;
    }

    public void display_dada() {
        System.out.println("Nome: " + firtName + " " + lastName);
        System.out.println("Idade: " + age);
        System.out.println("Documento: " + document);
        System.out.println("-----------------");
    }
}
