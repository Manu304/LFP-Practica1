package src.manejo_cadenas;

import java.util.ArrayList;

import src.token.TipoToken;
import src.token.Token;

public class ManejadorToken {
    ArrayList<Token> tokens = new ArrayList<>();
    String[] palabras;

    public ManejadorToken(String cadena){
        //this.palabras = ManejoCadena.listaPalabras(cadena);
        this.palabras = ManejoCadena.listaPalabras2(cadena);
        clasificar();
    }

    public void clasificar(){
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0) {
                String text = analizadorPalabra(palabras[i]);
                if (ManejoCadena.esEntero(text)) {
                    tokens.add(new Token(text, TipoToken.NUMERO_ENTERO));
                }else if(ManejoCadena.esDecimal(text)){
                    tokens.add(new Token(text, TipoToken.NUMERO_DECIMAL));
                }else if(ManejoCadena.esId(text)){
                    tokens.add(new Token(text, TipoToken.IDENTIFICADOR));
                }else{
                    tokens.add(new Token(text, TipoToken.ERROR));
                }
            }
        } 
    }

    private String analizadorPalabra(String palabra){
        String valor = "";
        palabra = palabra.trim();
        for (int i = 0; i < palabra.length(); i++) {
            // tener cuidado por si hay espacios en blanco dobles
            if (ManejoCadena.esSimbolo(palabra.charAt(i))) {
                tokens.add(new Token(palabra.charAt(i), TipoToken.SIMBOLO));
            }else{
                valor += palabra.charAt(i);
            }
        }
        return valor;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }
    
}
