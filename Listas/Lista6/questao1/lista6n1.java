import java.util.Scanner;

public class lista6n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o total de suas vendas: ");
        double vendas = sc.nextDouble();

        System.out.println("Insira seu desempenho : ");
        int des = sc.nextInt();

        double com = vendas >= 10000 ? 0.07 : 0.05;

        double rem = 2000 + (vendas * com);
        
        rem = des >= 8 ? rem += 500 : rem;

        System.out.printf("Remuneração: %.2f%n", rem);
        sc.close();
    }
}
