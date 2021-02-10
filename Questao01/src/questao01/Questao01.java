package questao01;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        
        int op = 0;
        
        Scanner entrada = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        while (op != 3){
            System.out.println("============ M E N U ============");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Mostrar dados do funcionário");
            System.out.println("3 - Sair");
            System.out.println("---------------------------------");
            System.out.print("Escolha a opção: ");
            op = entrada.nextInt();
            
            switch (op){
                case 1:
                    f1.cadastrar();
                    break;
                    
                case 2:
                    f1.mostrarCadastro();
                    break;
                    
                case 3: 
                    System.out.println("---------------------------------");
                    System.out.println("Saindo...");
                    break;
                   
                default:
                    System.out.println("---------------------------------");
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
        
    }
    
}
