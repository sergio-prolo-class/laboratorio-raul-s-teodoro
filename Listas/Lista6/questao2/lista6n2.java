import java.util.Scanner;

public class lista6n2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os três lados de um triângulo");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if(lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado1 < lado3 || lado2 + lado3 < lado1 || lado3 + lado2 < lado1 || lado3 + lado1 < lado2){
            System.err.println("Não é um triângulo");
        } else if(lado1==lado2 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");
        } else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("Triângulo Escaleno");
            // se lado1 e lado2 forem iguais e lado3 for diferente de lado1, então é triangulo isósceles, se lado1 e lado3 forem iguais e lado2 diferente de lado1...
        } else if(lado1 == lado2 && lado3 != lado1 || lado1 == lado3 && lado2 != lado1 || lado2 == lado3 && lado1 != lado2){
            System.out.println("Triângulo Isósceles");
        }


        sc.close();
    }
}