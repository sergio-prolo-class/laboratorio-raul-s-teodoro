import java.util.Scanner;

public class lista5n3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor em centavos");
        int valor = sc.nextInt();

        int moedas = valor / 50;
        System.out.printf("Moedas de 50 centavos: %d%n", moedas);
        valor = valor % 50; 

        moedas = valor / 25;
        System.out.printf("Moedas de 25 centavos: %d%n", moedas);
        valor = valor % 25;

        moedas = valor / 10;
        System.out.printf("Moedas de 10 centavos: %d%n", moedas);
        valor = valor % 10;

        moedas = valor / 5;
        System.out.printf("Moedas de 5 centavos: %d%n", moedas);
        valor = valor % 5;

        moedas = valor / 1;
        System.out.printf("Moedas de 1 centavos: %d%n", moedas);
        

        sc.close();

    }
}
