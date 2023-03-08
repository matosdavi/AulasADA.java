import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculadoraV2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite valor 1: ");
        BigDecimal valor1 = new BigDecimal(entrada.nextLine());

        System.out.print("Digite valor 2: ");
        BigDecimal valor2 = new BigDecimal(entrada.nextLine());

        System.out.print("soma (SO) subtracao (SU) divisao (DI) multiplicacao (MU): ");
        String operacao = entrada.nextLine();

        BigDecimal resultado = BigDecimal.ZERO;

        if ( operacao.equalsIgnoreCase("SO") ) {
            resultado = valor1.add(valor2);
        } else if ( operacao.equalsIgnoreCase("SU") ) {
            if (valor1.compareTo(valor2) == -1) {
                resultado = valor2.subtract(valor1);
            } else {
                resultado = valor1.subtract(valor2);
            }
        } else if ( operacao.equalsIgnoreCase("di") ) {
            resultado = valor1.divide(valor2, 10, RoundingMode.CEILING);
        } else if ( operacao.equalsIgnoreCase("MU") ) {
            resultado = valor1.multiply(valor2);
        }

        /*
        resultado = valor1
                .multiply(valor2)
                .multiply(BigDecimal.TEN)
                .subtract(new BigDecimal(30))
                .add(new BigDecimal(10))
                .setScale(2, RoundingMode.DOWN);
        */

        // != diferente

        resultado = resultado.setScale(2, RoundingMode.HALF_EVEN);

        System.out.printf("Resultado: %.2f", resultado);


    }

}
