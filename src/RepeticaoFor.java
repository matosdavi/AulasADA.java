import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("==========TABUADA==========\n");

        System.out.print("Informe um número para imprimir a sua tabuada: ");
        int numeroTabuada = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {

            int resultado = numeroTabuada * i;

            System.out.println(numeroTabuada + " X " + i + " = " + resultado);
        }
    }
}