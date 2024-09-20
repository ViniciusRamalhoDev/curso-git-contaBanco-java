import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberAccount;
        String bankAgency;
        String clientName;
        Double balance;

        System.out.print("Por favor, digite o número: ");
        numberAccount = input.nextInt();
        System.out.print("Por favor, digite a agência: ");
        input.nextLine();
        bankAgency = input.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        clientName = input.nextLine().toUpperCase();
        System.out.print("Por favor, digite seu saldo: ");
        balance = input.nextDouble();

        String information = "Olá [" + clientName + "], obrigado por criar uma conta em nosso banco, sua agência é [" +bankAgency + "], conta [" +numberAccount+ "], e seu saldo de [" +
        balance + "] ja está disponível para o saque."; 

        System.out.println("\n"+information);

        input.close();
    }
}
