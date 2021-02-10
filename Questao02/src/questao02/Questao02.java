package questao02;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        
        int op = 0;
        
        Scanner entrada = new Scanner(System.in);
        ContaBanco c1 = new ContaBanco();
        
        while (op != 6){
            
            System.out.println("======== M E N U ========");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar dados");
            System.out.println("6 - Sair");
            System.out.println("-------------------------");
            System.out.print("Escolha a opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1: 
                    c1.cadastrar();
                    break;
                case 2: 
                    c1.sacar();
                    break;
                case 3:
                    c1.depositar();
                    break;
                case 4:
                    c1.consultaSaldo();
                    break;
                case 5:
                    c1.consultaDados();
                    break;
                case 6:
                    System.out.println("---------------------------------");
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("---------------------------------");
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            
        }
        
    }
    
}
