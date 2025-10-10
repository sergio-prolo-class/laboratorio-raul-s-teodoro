import java.util.Scanner;

public class lista5n1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit");
        
        float fahrenheit = sc.nextFloat();

        float celsius = (fahrenheit - 32f) * (5f/9f);

        System.out.printf("A temperatura em celsius é %.3f%n", celsius);
    }
}