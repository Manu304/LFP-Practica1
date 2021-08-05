package src.manejo_cadenas;

import java.util.ArrayList;

import src.token.TipoToken;
import src.token.Token;

public class ManejadorToken {
    ArrayList<Token> tokens = new ArrayList<>();

    private int inicioChar = -1, finChar = -1;

    public void separarToken(String text){
        String cadena = ManejoCadena.quitarSalto(text);
        String contenidoToken = "";
        int finalPalabra = -1;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                if (ManejoCadena.esSimbolo(cadena.charAt(i))) {
                    tokens.add(new Token(Character.toString(cadena.charAt(i)), TipoToken.SIMBOLO));
                } else {
                    
                }
            }else{
                contenidoToken = "";

            }
        }
    }
}
