package src.manejo_cadenas;

import java.util.ArrayList;

public class ManejoCadena {

    private static final char[] SIMBOLOS = {'{', '}', '(', ')', '[', ']', ';', ',', ':'};

    public static boolean esEntero(String text){
        boolean valido = false;
        try {
            Integer.parseInt(text);
            valido = true;

        } catch (NumberFormatException e) {
            System.out.println("No es un entero");
        }
        return valido;
    }

    public static boolean esDecimal(String text){
        boolean valido = false;
        try {
            Double.parseDouble(text);
            valido = true;
        } catch (NumberFormatException e) {
            System.out.println("No es decimal");
        }
        return valido;
    }

    public static boolean esSimbolo(char simb){
        boolean igual = false;
        for (int i = 0; i < SIMBOLOS.length; i++) {
            if (simb == SIMBOLOS[i]) {
                igual = true;
            }
        }
        return igual;
    }

    public static boolean esId(String text){
        text = text.toUpperCase();
        boolean valido = false;
        if (text.length() == 0) {
            return false;
        }
        for (int i = 65; i <= 90; i++) {
            char compara = (char) i;
            if (text.charAt(0) == compara) {
                valido = true;
            }
        }
        return valido;
    }

    public static String quitarSalto(String text){
        text = text.trim();
        text = text.replace("\n", " ");
        return text;
    }
    
    /*public static String[] listaPalabras(String text){
        text = quitarSalto(text);
        String[] palabras = text.split(" ");
        return palabras;
    }*/

    public static String[] listaPalabras2(String cadena){
        cadena = quitarSalto(cadena);
        ArrayList<String> listaPalabras = new ArrayList<>();
        int inicio = 0, fin = 0;

        while (fin < cadena.length()-1) {
            for (int i = inicio; i < cadena.length(); i++) {
                fin = i;
                if (cadena.charAt(i) == ' ') {
                    listaPalabras.add(cadena.substring(inicio, fin));
                    inicio=fin+1;  
                }else if(i == cadena.length()-1){
                    listaPalabras.add(cadena.substring(inicio, cadena.length()));
                }
            }           

            System.out.println("acabo de dar una vuelta");

        }

        String[] palabras = new String[listaPalabras.size()];
        for (int i = 0; i < listaPalabras.size(); i++) {
            palabras[i] = listaPalabras.get(i);
        }
        return palabras;

    }
}
