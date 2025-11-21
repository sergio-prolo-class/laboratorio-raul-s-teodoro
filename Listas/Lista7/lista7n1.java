import java.util.Scanner;
public class lista7n1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número de linhas");
        int linhas = sc.nextInt();
        int saida = 1;

        for(int i = 1; i <= linhas; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf(" %d", saida);
                saida++;
            }
            System.out.println();
        }

    }
}
