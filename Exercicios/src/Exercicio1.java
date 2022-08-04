import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um número inteiro!");
        int x = scan.nextInt();
        
        for (int i = 1; i <= 10; i++){
            int multi = x * i;
            System.out.println(x + " x " + i + " = " + multi);
        }
        
    }
    
}
