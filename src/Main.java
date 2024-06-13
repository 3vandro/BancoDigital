import Finance.Cliente;
import Finance.Conta;
import Finance.ContaCorrente;
import Finance.ContaPoupanca;

import java.util.Scanner;

import java.io.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        InputStream entradaSistema = System.in;
//        InputStreamReader leitor = new InputStreamReader(entradaSistema);
//        BufferedReader leitorEntrada = new BufferedReader(leitor);
//
//
//        //entrada no teclado
//        String entradaTeclado;
//
//        String opcao1 = "1";
//        String opcao2 = "2";
//        String opcao3 = "3";
//
//        System.out.println("""
//                Digite 1 para criar uma conta
//                Digite 2 para acessar a sua conta
//                Digite 3 para Sair-
//                """);
//
//        while(true){
//            entradaTeclado = leitorEntrada.readLine();
//            String Opcao = entradaTeclado;
//
//            if (Opcao.equals(opcao1)) {
//                Cliente kali = new Cliente();
//                kali.setNome("Kali");
//
//                Conta cc = new ContaCorrente(kali);
//                Conta cp = new ContaPoupanca(kali);
//
//
//                cc.depositar(1500);
//                cc.transferir(100,cp);
//
//
//                System.out.println("=======");
//                cc.imprimirExtrato();
//                System.out.println("=======");
//                cp.imprimirExtrato();
//                System.out.println("=======");
//
//                System.out.println("=======");
//
//
//
//            } else if (Opcao.equals(opcao2)) {
//                Cliente freya = new Cliente();
//                freya.setNome("Freya");
//
//                Conta nc = new ContaPoupanca(freya);
//
//                System.out.println("=======");
//                nc.imprimirExtrato();
//                System.out.println("=======");
//
//            } else if (Opcao.equals(opcao3)) {
//                System.out.println("Sistema Finalizado");
//                break;
//
//            } else {
//                System.out.println("Opção inválida. Digite novamente");
//            }
//
//        }

//        Scanner sc = new Scanner(System.in);
//        int question;
//
//        System.out.println("Digite 1 para adicionar pessoa. Digite 2 para remover pessoa. Digite 3 para pesquisar uma pessoa. Digite 4 para sair.");
//
//        do {
//            System.out.print("Escolha uma opção: ");
//            question = sc.nextInt();
//
//            switch (question) {
//                case 1:
//                    // Lógica para adicionar pessoa
//                    System.out.println("Você escolheu adicionar pessoa.");
//                    break;
//                case 2:
//                    // Lógica para remover pessoa
//                    System.out.println("Você escolheu remover pessoa.");
//                    break;
//                case 3:
//                    // Lógica para pesquisar pessoa
//                    System.out.println("Você escolheu pesquisar pessoa.");
//                    break;
//                case 4:
//                    // Encerra o programa
//                    System.out.println("Programa encerrado.");
//                    break;
//                default:
//                    System.out.println("Opção inválida. Digite novamente.");
//            }
//        } while (question != 4);



        Cliente kali = new Cliente();
        kali.setNome("Kali");

        Cliente freya = new Cliente();
        freya.setNome("Freya");


        Conta cc = new ContaCorrente(kali);
        Conta cp = new ContaPoupanca(kali);
        Conta nc = new ContaPoupanca(freya);

        cc.depositar(1500);
        cc.transferir(750,nc);
        cc.transferir(100,cp);
        cc.contratarEmprestimo(100,10);
        nc.contratarEmprestimo(100,5);
        cp.contratarEmprestimo(100,2);



        cc.imprimirExtrato();
        System.out.println("=======");
        cp.imprimirExtrato();
        System.out.println("=======");
        nc.imprimirExtrato();

    }
}