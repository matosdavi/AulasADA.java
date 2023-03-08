import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Scanner entrada = new Scanner(System.in);

        imprime("Informe o nome do aluno: ");
        aluno1.nome = entrada.nextLine();

        imprime("Informe o número da matrícula do aluno: ");
        aluno1.matricula = Integer.parseInt(entrada.nextLine());

        imprime("Informe a primeira nota do aluno: ");
        aluno1.nota1 = Double.parseDouble(entrada.nextLine());
        imprime("Informe a segunda nota do aluno: ");
        aluno1.nota2 = Double.parseDouble(entrada.nextLine());
        imprime("Informe a terceira nota do aluno: ");
        aluno1.nota3 = Double.parseDouble(entrada.nextLine());
        imprime("Informe a quarta nota do aluno: ");
        aluno1.nota4 = Double.parseDouble(entrada.nextLine());

        aluno1.calcularMedia();
    }
    static void imprime(String msg) {
        System.out.print(msg);
    }
}