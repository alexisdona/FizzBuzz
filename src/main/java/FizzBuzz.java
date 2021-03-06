import java.util.ArrayList;

public class FizzBuzz {

    //Método que me evalua si numero1 es divisible por numero2
    public boolean esDivisible(int numero1,int numero2) {
        return (numero1%numero2==0);
    }

    //Método que me ejecuta el juego.
    public void ejecutar (int[] unArreglo,String[] unArregloDeStrings) {

        for(int i=0;i<unArreglo.length;i++) {
            unArregloDeStrings[i] = unArreglo[i]+":"+evaluarItem(unArreglo[i]);
        }
        //una vez llenado el arreglo de Strings con la lógica del juego lo imprimo por pantalla.
        this.mostrarResultado(unArregloDeStrings);
    }

    public void mostrarResultado(String[] unArregloDeStrings) {
        for (int i=0;i<unArregloDeStrings.length;i++) {
            System.out.println(unArregloDeStrings[i]);
        }
    }

    public String evaluarItem(int numero) {
        if (esDivisible(numero,3)&&esDivisible(numero,5)){
            return "FizzBuzz";
        }
        else if (esDivisible(numero,3)) {
            return "Fizz";
        }
        else if (esDivisible(numero,5)){
            return "Buzz";
        }
        else {
            return String.valueOf(numero);
        }
    }
}
