import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, num3, num4, num5, soma;
        double media;
        
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();
        
        System.out.print("Digite o quarto número: ");
        num4 = input.nextInt();
        
        System.out.print("Digite o quinto número: ");
        num5 = input.nextInt();
        
        soma = num1 + num2 + num3 + num4 + num5;
        media = (double) soma / 5;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        input.close();
    }
}