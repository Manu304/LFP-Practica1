package src.manejo_cadenas;

public class ManejoCadena {

    private static final char[] SIMBOLOS = {'{', '}', '(', ')', '[', ']', ';', ','};

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

    public static String quitarSalto(String text){
        text = text.trim();
        text = text.replace("\n", " ");
        return text;
    }
    
}
