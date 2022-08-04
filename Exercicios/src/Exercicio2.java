
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        boolean flag = true;
        double bhaskara1;
        double bhaskara2;
        int x = 2;
        double raizDelta = 1;
        double faturacao = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor inteiro para 'a'");
        double a = scan.nextInt();
        System.out.println("Digite um valor inteiro para 'b'");
        double b = scan.nextInt();
        System.out.println("Digite um valor inteiro para 'c' (termo independente)");
        double c = scan.nextInt();

        System.out.println("Sua equacao: " + a + "x2" + " + " + b + "x" + " + " + c);

        double delta = (b * b) - (4 * a * c);
        System.out.println("delta: " + delta);

        if (delta > 0) {

            do {
               
                raizDelta = x * x;
                //System.out.println("x: " + x);
                if (raizDelta == delta) {
                    raizDelta = x;
                    flag = false;
                } else if (raizDelta > delta) {
                    flag = false;
                } else {
                    x++;
                }                   

            } while (flag == true);
            
            System.err.println("raizDelta: " + raizDelta);

            System.out.println("A equação de segundo grau acima possuí 2 raízes reais pois o delta é maior que zero!");
            bhaskara1 = (((b - b) - b) + raizDelta) / (2 * a);
            bhaskara2 = (((b - b) - b) - raizDelta) / (2 * a);
            System.out.println("As raízes reais da equação são: " + bhaskara1 + " e " + bhaskara2);

        } else if (delta == 0) {
            raizDelta = 0;
            System.out.println("A equação de segundo grau acima possuí 1 raíz real pois o delta é igual a 0!");
            bhaskara1 = ((b - b - b) + raizDelta) / (2 * a);
            System.out.println("A raíz real da equação é: " + bhaskara1);

        } else if (delta < 0) {
            System.out.println("A equacao de segundo grau acima nao possui raizes reais pois o delta é negativo!");
        }

    }
}
