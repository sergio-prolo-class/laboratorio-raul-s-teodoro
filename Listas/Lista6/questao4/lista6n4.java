import java.util.Scanner;

public class lista6n4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Insira o valor negociado");
        double valor = sc.nextDouble();
        double com1 = 30 + (valor * 0.017);
        if(com1 < 39)
            com1 = 39;
        double com2 = 56 + (valor * 0.0066);
        double com3 = 76 + (valor * 0.0034);
        double com4 = 100 + (valor * 0.0022);
        double com5 = 155 + (valor * 0.0011);
        double com6 = 255 + (valor * 0.0009);
        double comissao = 0;

        if(valor < 2500){
            comissao = com1;
        } else if(valor < 6250){
            comissao = com2;
        } else if(valor < 20000){
            comissao = com3;
        } else if(valor < 50000){
            comissao = com4;
        } else if(valor < 500000){
            comissao = com5;
        } else{
            comissao = com6;
        }

        System.out.printf("O valor de sua comissão é %2f%n", comissao);
        
        sc.close();
    }
}
