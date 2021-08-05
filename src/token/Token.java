package src.token;

public class Token {
    private String valor;
    private TipoToken tipo;
    
    public Token(String valor) {
        this.valor = valor;
    }

    /*private TipoToken asignarTipo(String valor){
        int contadorID = 0, contadorEntero = 0, contadorDecimal = 0, contadorSimbolo = 0;
        for (int i = 0; i < valor.length(); i++) {
            
        }
    }*/

    private boolean esEntero(String text){
        boolean valido = false;
        try {
            Integer.parseInt(text);
            valido = true;

        } catch (NumberFormatException e) {
            System.out.println("No es un entero");
        }
        return valido;
    }

    private boolean esDecimal(String text){
        boolean valido = false;
        try {
            Double.parseDouble(text);
            valido = true;
        } catch (NumberFormatException e) {
            System.out.println("No es decimal");
        }

        return valido;
    }

    

    
}
