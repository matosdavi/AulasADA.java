import java.util.Scanner;

public class ArrayNomes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de nomes: ");
        int qtdeNomes = Integer.parseInt(entrada.nextLine());

        String[] nomesDigitados = new String[qtdeNomes];

        for (int i = 0; i < qtdeNomes; i++){
            System.out.printf("Informe o nome %s: ", (i + 1));
            String nome = entrada.nextLine();
            nomesDigitados[i] = nome;
        }

        for (int i = 0; i < nomesDigitados.length; i++) {
            String nome = nomesDigitados[i];
            System.out.println(nome.toUpperCase());
        }
    }
}