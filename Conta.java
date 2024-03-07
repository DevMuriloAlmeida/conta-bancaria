import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeUsuario = "Murilo Almeida";
        String tipoConta = "Corrente";
        double saldo = 1000;

        int opcao = 0;
        boolean sair = false;

        System.out.println("DADOS DA CONTA:");
        System.out.println("NOME: " + nomeUsuario);
        System.out.println("TIPO DE CONTA: " + tipoConta);
        System.out.println("SALDO: R$" + saldo);

        while (sair != true){
            menu();
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    consultarSaldo(saldo);
                    break;

                case 2:
                    System.out.println("\nDEPOSITO DE VALOR");
                    System.out.print("VALOR DO DEPOSITO: R$");
                    double valorDeposito = scan.nextDouble();
                    saldo += depositarValor(valorDeposito);
                    consultarSaldo(saldo);
                    break;

                case 3:
                    System.out.println("\nSAQUE DE VALOR");
                    System.out.print("VALOR A RETIRAR: R$");
                    double valorSaque = scan.nextDouble();

                    if (saldo < valorSaque){
                        System.out.println("\nSALDO INDISPONIVEL!");
                        consultarSaldo(saldo);
                    }else {
                        saldo -= sacarValor(valorSaque);
                        consultarSaldo(saldo);
                    }
                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("\nOPÇÃO INVÁLIDA!");
                    break;
            }
        }
    }

    static void menu(){
        System.out.println("""
                \nMENU DE OPÇÕES
                1 - CONSULTAR SALDO
                2 - DEPOSITAR VALOR
                3 - SACAR VALOR
                0 - SAIR""");
        System.out.print("Selecione uma opção: ");
    }

    static void consultarSaldo(double saldo){
        System.out.println("\nCONSULTA DE SALDO");
        System.out.println("SALDO DISPONIVEL: R$" + saldo);
    }

    static double depositarValor(double valorDeposito){
        return valorDeposito;
    }

    static double sacarValor(double valorSaque){
        return valorSaque;
    }
}
