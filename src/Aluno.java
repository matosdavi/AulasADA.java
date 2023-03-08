public class Aluno {

    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;

    public void calcularMedia() {
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Aluno: " + nome + "\nMatrícula: " + matricula + "\nMédia: " + media);
    }
}
