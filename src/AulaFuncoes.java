public class AulaFuncoes {

    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 20;

        int resultadoSoma = somar(valor1, valor2);
        int resultadoSubtracao = subtrair(valor1, valor2);
        int resultadoMultiplicacao = multiplicar(valor1, valor2);

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);


        System.out.println("TABUADA\n");
        int tabuada = 3;
        for (int i = 0; i <= 10; i++) {
            int resultadoTabuada = multiplicar(tabuada, i);
            System.out.println(tabuada + " X " + i + " = " + resultadoTabuada);
        }
    }

    static int somar(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return resultado;
    }

    static int subtrair(int valor1, int valor2) {
        int resultado = valor1 - valor2;
        return resultado;
    }

    static int multiplicar(int valor1, int valor2) {
        int resultado = valor1 * valor2;
        return resultado;
    }
}