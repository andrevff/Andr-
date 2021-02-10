package atividadeav2;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeAV2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<Funcionário>dados1 = new ArrayList();
        ArrayList<Cliente>dados2 = new ArrayList();
        
        int op = 0;
        while (op != 7){
            System.out.println("---------------------------------------");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Mostrar lista de funcionários");
            System.out.println("4 - Mostrar lista de clientes");
            System.out.println("5 - Deletar cadstro de funcionário");
            System.out.println("6 - Deletar cadastro de cliente");
            System.out.println("7 - Sair");
            System.out.println("---------------------------------------");
            System.out.print("Digite o número da opção: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1: 
                    System.out.println("---------------------------------------");
                    System.out.print("Nome: ");
                    String nome = entrada.next();
                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    System.out.print("Cargo: ");
                    String cargo = entrada.next();
                    System.out.println("---------------------------------------");
                    dados1.add(new Funcionário(nome, idade, cargo));
                break;
                
                case 2: 
                    System.out.println("---------------------------------------");
                    System.out.print("Nome: ");
                    String nome2 = entrada.next();
                    System.out.print("Idade: ");
                    int idade2 = entrada.nextInt();
                    System.out.print("Tipo: ");
                    String tipo = entrada.next();
                    System.out.println("---------------------------------------");
                    dados2.add(new Cliente(nome2, idade2, tipo));
                break;
                
                case 3: 
                    System.out.println("---------------------------------------");
                    System.out.println("A empresa tem " +dados1.size()+ " funcionários");
                    if(dados1.isEmpty()){
                        System.out.println("Sua empresa não tem funcionários");
                    }else{
                        System.out.println("---------------------------------------");
                        System.out.printf("%5s%15s%15s%n", "Nome", "Idade", "Cargo");
                        dados1.forEach((a) -> {
                        System.out.printf("%5s%15s%15s%n", a.getNome(), a.getIdade(), a.getCargo());
            });
                    }
                    System.out.println("---------------------------------------");
                break;
                
                case 4:
                    System.out.println("---------------------------------------");
                    System.out.println("A empresa tem " +dados2.size()+ " cliente");
                    if(dados2.isEmpty()){
                        System.out.println("Sua empresa não tem clientes");
                    }else{
                        System.out.println("---------------------------------------");
                        System.out.printf("%5s%15s%15s%n", "Nome", "Idade", "Tipo");
                        dados2.forEach((b) -> {
                        System.out.printf("%5s%15s%15s%n", b.getNome(), b.getIdade(), b.getTipo());
            });
                    }
                    System.out.println("---------------------------------------");
                break;
                
                case 5:
                    System.out.println("---------------------------------------");
                    System.out.print("Qual cadastro deseja excluir? ");
                    String remove = entrada.next();
                    
                    for(int i = 0; i < dados1.size(); i++){
                        Funcionário idFuncionário = dados1.get(i);
                        if(idFuncionário.getNome().equalsIgnoreCase(remove));
                        dados1.remove(i);
                        System.out.println("---------------------------------------");
                        System.out.println("REMOVIDO");
                        System.out.println("---------------------------------------");
                    }
                break;
                
                case 6:
                    System.out.println("---------------------------------------");
                    System.out.print("Qual cadastro deseja excluir? ");
                    String remove2 = entrada.next();
                    
                    for(int i = 0; i < dados2.size(); i++){
                        Cliente idCliente = dados2.get(i);
                        if(idCliente.getNome().equalsIgnoreCase(remove2));
                        dados2.remove(i);
                        System.out.println("---------------------------------------");
                        System.out.println("REMOVIDO");
                        System.out.println("---------------------------------------");
            }
                break;
                
                case 7:
                    System.out.println("---------------------------------------");
                    System.out.println("SAINDO...");
                    System.out.println("---------------------------------------");
                break;
                
                default:
                    System.out.println("---------------------------------------");
                    System.out.println("Opção inválida, tente novamente");
                    System.out.println("---------------------------------------");
        }
    }

   
    }
    }
