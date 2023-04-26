import java.util.Scanner;

public class NumerosParesEImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, pares = 0, impares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = input.nextInt();
            
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares);
        
        input.close();
    }
}