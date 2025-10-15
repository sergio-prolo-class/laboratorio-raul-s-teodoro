import java.util.Scanner;

public class lista5n2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota do aluno");
        float nota = sc.nextFloat();
        
        System.out.println("Insira a segunda nota do aluno");
        nota += sc.nextFloat();
        
        System.out.println("Insira a terceira nota do aluno");
        nota += sc.nextFloat();

        System.out.println("Insira a quarta nota do aluno");
        nota += sc.nextFloat();

        System.out.println("Insira a frequência do aluno");
        int frequencia =  sc.nextInt();

        String result = (nota / 4 > 6) && frequencia > 75 ? "Aprovado" : "Reprovado";

        System.out.printf("Média: %.1f - %s %n", (nota/4), result);
        sc.close();
    }
}