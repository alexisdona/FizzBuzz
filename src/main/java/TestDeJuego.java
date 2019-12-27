public class TestDeJuego {
    public static void main (String [ ] args) {
        //Instancio el Juego
        FizzBuzz juego = new FizzBuzz();
        // Le pido al juego crear un arreglo de enteros de 150 posiciones
        int [] arregloInts = new int[150];
        String [] arregloDeStrings = new String[150];

        //Ejecuto el juego pasándole como parametro el arreglo instanciado y veo qué devuelve por consola.
        juego.ejecutar(arregloInts,arregloDeStrings);
    }
}
