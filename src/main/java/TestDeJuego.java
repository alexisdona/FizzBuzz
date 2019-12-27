public class TestDeJuego {
    public static void main (String [ ] args) {
        //Instancio el Juego
        FizzBuzz juego = new FizzBuzz();
        // Creo dos arreglos, uno de enteros y otro de Strings de enteros de 150 posiciones
        int [] arregloInts = new int[150];
        //lleno el arreglo de enteros de 1 a 150
        for (int i=0;i<arregloInts.length;i++) {
            arregloInts[i] = i+1;
        }

        String [] arregloDeStrings = new String[150];

        //Ejecuto el juego pasándole como parametro el arreglo instanciado y veo qué devuelve por consola.
        juego.ejecutar(arregloInts,arregloDeStrings);
    }
}
