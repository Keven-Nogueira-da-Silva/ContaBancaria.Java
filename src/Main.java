import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ContaBancaria cass = new ContaBancaria();
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Bem vindo ao sistema bancário. \n " +
                "O que gostaria de realizar.");

        while(true) {
            System.out.println("""
                    Opções:
                    Sacar - 1
                    Consultar saldo - 2
                    Depositar - 3
                    Sair - 0""");

            number = sc.nextInt();
            sc.nextLine();

            if (number == 1) {
                System.out.println("Digite seu nome");
                cass.setNome(sc.nextLine());
                System.out.println("Digite seu banco");
                cass.setBanco(sc.nextLine());
                System.out.println("Valor para sacar: ");
                cass.setSacarValor(sc.nextDouble());
            } else if (number == 2){
                System.out.println(cass.saldoAtual);
            } else if (number == 3){
                System.out.println("Digite seu nome");
                cass.setNome(sc.nextLine());
                System.out.println("Digite seu banco");
                cass.setBanco(sc.nextLine());
                System.out.println("Digite um valor para depositar: ");
                cass.setValorParaDepositar(sc.nextDouble());
            } else if (number == 0){
                System.out.println("Ultima execução: ");
                System.out.println("Nome do cliente: "+cass.getNome());
                System.out.println("Banco do cliente "+cass.getBanco());
                System.out.println("Saldo atual do cliente: R$"+cass.saldoAtual);
                break;
            }
        }
        sc.close();

    }
}

