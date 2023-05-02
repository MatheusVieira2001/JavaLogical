import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        // solicita informações do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();
       
	  // solicitar a conta
        System.out.print("Por favor, digite o número da Conta: ");
        String numero = sc.next();
        
        // solicitar o nome
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.next();
        
	  //solicitar o saldo
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = sc.nextDouble();
        
        // exibe mensagem final com as informações da conta bancária
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

    }
}
