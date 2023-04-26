import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeUsuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(nomeUsuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário.\n");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Usuário e senha cadastrados com sucesso!");
    }
}
    