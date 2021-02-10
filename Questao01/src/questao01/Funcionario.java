package questao01;

import java.util.Scanner;

public class Funcionario {
    
Scanner entrada = new Scanner(System.in);

private String nome, sobrenome;
private float salario1, salario2, gratif;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public float getSalario1(){
        return this.salario1;
    }

    public void setSalario1(float salario1){
        this.salario1 = salario1;
    }

    public float getSalario2(){
        return this.salario2;
    }

    public void setSalario2(float salario2){
        this.salario2 = salario2;
    }

    public float getGratif(){
        return this.gratif;
    }

    public void setGratif(float gratif) {
        this.gratif = gratif;
    }

    public void cadastrar(){
        System.out.println("---------------------------------");
        System.out.print("Informe o nome do funcionário: ");
        setNome(entrada.next());
        System.out.print("Informe o sobrenome: ");
        setSobrenome(entrada.next());
        System.out.print("Informe o salário: ");
        setSalario1(entrada.nextFloat());
        System.out.print("Informe a gratificação (%): ");
        setGratif(entrada.nextFloat());
    }
    
    public void mostrarCadastro(){
        System.out.println("---------------------------------");
        System.out.println("Nome completo: " +this.getNome()+ " " +this.getSobrenome());
        System.out.println("Salário: R$" +this.getSalario1());
        System.out.println("Gratificação: " +this.getGratif() +"%");
        salario2 = salario1 + (salario1) * (gratif/100);
        System.out.println("Salário + gratificação : R$" +this.getSalario2());
      
    }
    
}
