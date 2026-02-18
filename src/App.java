import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {

            System.out.println("\n== Bem-vindo ao sistema de cadastros ==");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Listar");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");

            int select_menu = scanner.nextInt();

            switch (select_menu) {
                case 1:
                    System.out.println("\n== Cadastro de pessoas ==");

                    System.out.println("\nDigite o primero nome: ");
                    var firstName = scanner.next();

                    System.out.println("\nDigite o sobrenome: ");
                    var lastName = scanner.next();

                    System.out.println("\nDigite a idade: ");
                    var age = scanner.nextInt();

                    System.out.println("\nEscolha o documento: ");
                    System.out.println("1 - RG ");
                    System.out.println("2 - CPF");
                    var option = scanner.nextInt();

                    String document = "";

                    switch (option) {
                        case 1:
                            System.out.println("\nDigite o RG: ");
                            document = scanner.next();
                            break;
                        case 2:
                            System.out.println("\nDigite o CPF: ");
                            document = scanner.next();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }

                    Pessoa pessoa = new Pessoa(firstName, lastName, age, document);

                    pessoas.add(pessoa);

                    
                    System.out.println("\nPessoa cadastrada com sucesso! ");

                    break;

                case 2:
                    if (pessoas.isEmpty()) {
                    System.out.println("\nNão há pessoas cadastradas no sistema");
                    } else {
                        System.out.println("\n== Pessoas cadastradas ==");
                        for (Pessoa p : pessoas) {
                            p.display_dada();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEncerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    break;
            }

        }

    }

}
