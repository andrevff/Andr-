package atividadeav2;

public class Funcionário extends Pessoa{
    
   private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionário(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }
   
   public void CadastroFuncionario(){
       
   }
}
