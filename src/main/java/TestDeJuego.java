public class TestDeJuego {
    public static void main (String [ ] args) {
        //Instancio el Juego
        Juego juego = new Juego();
        // Le pido al juego crear un arreglo de enteros de 150 posiciones
        int [] arregloInts = juego.crearArregloInt(150);
        String [] arregloDeStrings = juego.crearArregloString(150);
        //Lleno el arrelgo desde el 1 hasta el 150
        juego.llenarArregloDeEnteros(arregloInts);
        //Ejecuto el juego pasándole como parametro el arreglo instanciado y veo qué devuelve por consola.
        juego.ejecutar(arregloInts,arregloDeStrings);
    }
}
