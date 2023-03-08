import java.time.LocalDateTime;

public class ArrayFuncoes {

    public static void main(String[] args) {

        String[] filmes = new String[]{"Piratas do Caribe", "Crepúsculo", "Harry Potter", "O Senhor dos Anéis", "Star Wars", "O Dia do Terror"};
        String[] livros = new String[]{"Crepúsculo", "Harry Potter", "Star Wars", "Gossip Girl"};

        imprimirArray(livros);
        imprimirArray(filmes);
    }
    static void imprimirArray (String[] array) {

        for (int i = 0; i < array.length; i++) {
            imprimir(i + " - " + array[i]);
        }
    }

    static void imprimir(String msg) {
        System.out.println(" (*_*) " + msg);
    }
}