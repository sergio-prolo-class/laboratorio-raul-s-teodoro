import java.util.Scanner;

public class lista5n4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um ano(d.c)");
        int ano = sc.nextInt();

        String bissexto = (ano % 4 == 0) || (ano % 400 == 0) & !( ano %100 == 0) ? "O ano é bissexto" : "O ano não é bissexto";
        System.out.println(bissexto);
        sc.close();
       

    }
    
}