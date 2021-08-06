package src.token;

public class Token {
    private String valor;
    private TipoToken tipo;
    
    public Token(String valor, TipoToken tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public Token(char valor, TipoToken tipo) {
        this.valor = Character.toString(valor);
        this.tipo = tipo;
    }
    
    public TipoToken getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return valor;
    }
    
}
