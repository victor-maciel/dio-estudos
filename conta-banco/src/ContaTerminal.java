import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();
        System.out.println("Agora, Informe o número da conta !");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe seu nome !");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, informe o saldo !");
        saldo = sc.nextDouble();

        System.out.printf("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
