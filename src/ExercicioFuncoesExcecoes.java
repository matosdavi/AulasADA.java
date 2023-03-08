package br.com.ada.first973.primeiroprojeto.aulas;

import java.util.Scanner;

public class ExercicioFuncoesExcecoes {

    final static int ANO_ATUAL = 2023;
    final static int MAIOR_IDADE = 18;
    static final String ACESSO_LIBERADO = "Acesso liberado";
    static final String ACESSO_NEGADO = "Acesso negado";
    static final String DIGITE_O_SEU_ANO_DE_NASCIMENTO = "Digite o seu ano de nascimento: ";

    public static void main(String[] args) {

        try {
            Scanner entrada = new Scanner(System.in);
            imprime(DIGITE_O_SEU_ANO_DE_NASCIMENTO);
            String ano = entrada.nextLine();
            if (ano.length() > 4) {
                throw new Exception("Ano invalido");
            }
            int anoNascimento = Integer.parseInt(ano);
            int idade = idade(anoNascimento);
            boolean maiorIdade = maiorIdade(idade);
            if (maiorIdade) {
                imprime(ACESSO_LIBERADO);
            } else {
                imprime(ACESSO_NEGADO);
            }

            String nome = null;
            if (nome == null) {
                nome = "";
            }
            if (nome.equals("X")) {
                imprime("TESTE");
            }

        } catch (NumberFormatException e) {
            imprime("Digite apenas valores numericos.");
            main(args);
        } catch (Exception e) {
            imprime("Aconteceu um erro: " + e.getMessage());
        } finally {
            imprime("Finaliza metodo main");
        }

    }

    static int idade(int anoNascimento) {
        int idade = ANO_ATUAL - anoNascimento;
        return idade;
    }

    static boolean maiorIdade(int idade) {

        return (idade >= MAIOR_IDADE);

        /*if (idade >= 18) {
            return true;
        } else {
            return false;
        }*/
    }

    static void imprime(String msg) {
        System.out.println(msg);
    }

}
