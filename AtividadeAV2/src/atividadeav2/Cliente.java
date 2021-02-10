package atividadeav2;

public class Cliente extends Pessoa {
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente(String nome, int idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }
    
    
}
