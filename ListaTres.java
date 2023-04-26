import java.util.Scanner;

public class ValidacaoDeDados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicita e valida o nome
        String nome;
        do {
            System.out.print("Digite o nome: ");
            nome = input.nextLine();
        } while (nome.length() <= 3);
        
        // Solicita e valida a idade
        int idade;
        do {
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
        } while (idade < 0 || idade > 150);
        
        // Solicita e valida o salário
        double salario;
        do {
            System.out.print("Digite o salário: ");
            salario = input.nextDouble();
        } while (salario <= 0);
        
        // Solicita e valida o sexo
        char sexo;
        do {
            System.out.print("Digite o sexo (f ou m): ");
            sexo = input.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
        
        // Solicita e valida o estado civil
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil (s, c, v ou d): ");
            estadoCivil = input.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
        
        // Exibe os dados informados pelo usuário
        System.out.println("\nDados informados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        
        input.close();
    }

}
