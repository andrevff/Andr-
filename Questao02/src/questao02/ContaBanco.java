package questao02;

import java.util.Scanner;

public class ContaBanco {
    
    Scanner entrada = new Scanner(System.in);
    
    private String nome, numeroConta;
    private int tipoConta;
    private float saque, deposito, saldo;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public int getTipoConta(){
        return this.tipoConta;
    }
    
    public void setTipoConta(int tipoConta){
        this.tipoConta = tipoConta;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public float getSaque() {
        return this.saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getDeposito() {
        return this.deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
    
    
    
    public void cadastrar(){
        System.out.println("---------------------------------");
        System.out.print("Informe o nome: ");
        this.setNome(entrada.next());
        System.out.print("Informe o número da conta: ");
        this.setNumeroConta(entrada.next());
        System.out.println("Informe o tipo da conta (1 - Corrente/ 2 - Poupança)");
        this.setTipoConta(entrada.nextInt());
        if(this.getTipoConta() == 1){
            this.saldo = 100;
        }else{
            this.saldo = 50;
        }
    }
    
    public void sacar(){
        System.out.println("---------------------------------");
        System.out.print("Quanto deseja sacar?: ");
        this.setSaque(entrada.nextFloat());
        this.saldo = this.getSaldo() - this.getSaque();
    }
    
    public void depositar(){
        System.out.println("---------------------------------");
        System.out.print("Quanto deseja depositar? ");
        this.setDeposito(entrada.nextFloat());
        this.saldo = this.getSaldo() + this.getDeposito();
    }
    
    public void consultaSaldo(){
        System.out.println("---------------------------------");
        System.out.println("Saldo atual: R$" +this.getSaldo());
    }
    
    public void consultaDados(){
        System.out.println("---------------------------------");
        System.out.println("Nome: " +this.getNome());
        System.out.println("Número da conta: " +this.getNumeroConta());
        if(this.getTipoConta() == 1){
            System.out.println("Tipo da conta: CORRENTE");
        }else{
            System.out.println("Tipo da conta: POUPANÇA");
        }
    }
    
}
