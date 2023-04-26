import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota entre zero e dez: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
             System.out.print("Valor inválido, A nota deve estar entre zero e dez ");

            }
        }while (nota < 0 || nota > 10);

        System.out.print("A nota digitada foi: " + nota );
        
        scanner.close();
       
    } 
}   