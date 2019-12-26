public class Juego {
    // Me instancia un arreglo de enteros de la cantidad que le paso por parámetro
    public int[] crearArregloInt (int tamanio) {
        return new int[tamanio];
    }

    //Me instancia un arreglo de Strings de la cantidad que le paso por parámetro
    public String [] crearArregloString (int tamanio) {
        return new String[tamanio];
    }

    //Lleno el arreglo de enteros recorriéndolo posición a posición
    public void llenarArregloDeEnteros(int [] unArreglo) {
        for(int i=0;i<unArreglo.length;i++) {
            unArreglo[i] = i+1;
        }
    }
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
