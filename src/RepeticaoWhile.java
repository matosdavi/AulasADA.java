public class RepeticaoWhile {

    public static void main(String[] args) {

        int i = 0;
        boolean executa = true;

        while (executa) {
            System.out.println(i++);

            if (i > 5) {
                executa = false;
            }
        }

        do {
            System.out.println("do while, " + i++);
            if (i == 5) {
                executa = false;
            }
        } while (executa);
    }
}