package contasbanco;

import java.util.Scanner;

public class ContasBanco {

    public static void main(String[] args) {
        Scanner di = new Scanner(System.in);
        Banco banco = new Banco();
        int digit;
        do {
            System.out.println("--------------------------");
            System.out.println("(1) - Manter Conta.");
            System.out.println("(2) - Efetuar Operacoes.");
            System.out.println("(0) - Sair.");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                    interface0(banco);
                    break;
                case 2:
                    interface1(banco);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Operação Invalida.");
                    break;
            }
        } while (digit != 0);

    }

    static void interface0(Banco banco) {
        Scanner di = new Scanner(System.in);
        String digi;
        int digit;
        do {
            System.out.println("--------------------------");
            System.out.println("(1)-Criar Conta");
            System.out.println("(2)-Remover Conta");
            System.out.println("(3)-Listar Contas");
            System.out.println("(4)-Pesquisa Conta");
            System.out.println("(0)-Retornar");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                	System.out.print("Insira o nome do titular: ");
                	digi = di.nextLine();
                	banco.criarConta(digi);
                    break;
                case 2:
                	System.out.print("Insira o numero da conta: ");
                	digit = Integer.parseInt(di.nextLine());
                	banco.removerConta(digit);
                    break;
                case 3:
                	banco.listarContas();
                    break;
                case 4:
                	System.out.println("Insira um nome:");
                	digi = di.nextLine();
                    banco.pesquisarContas(digi);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero Invalido.");
            }
        } while (digit != 0);
    }

    static void interface1(Banco banco) {
        Scanner di = new Scanner(System.in);

        double dig;
        int digit;
        Integer num;
        do {
            System.out.println("--------------------------");
            System.out.println("(1)-Sacar");
            System.out.println("(2)-Depositar");
            System.out.println("(3)-Extrato");
            System.out.println("(0)-Retornar");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                	System.out.print("Insira o numero da conta: ");
                	num = Integer.parseInt(di.nextLine());
                    System.out.print("Insira o Valor: ");
                	dig = Double.parseDouble(di.nextLine());
                    banco.sacar(dig,num);
                    break;
                case 2:
                	System.out.print("Insira o numero da conta: ");
                	num = Integer.parseInt(di.nextLine());
                    System.out.print("Insira o Valor: ");
                	dig = Double.parseDouble(di.nextLine());
                    banco.depositar(dig,num);
                    break;
                case 3:
                	System.out.print("Insira o numero da conta: ");
                	num = Integer.parseInt(di.nextLine());
                    banco.efetuaExtrato(num);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero Invalido.");
            }
        } while (digit != 0);
        
    }
}
