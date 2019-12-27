import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    public int[] arregloDeEnteros;
    public String [] arregloDeStrings;
    public FizzBuzz juego;

    @Before
    public void iniciarTests() {
       this.arregloDeEnteros= new int[150];
       this.arregloDeStrings = new String[150];
       this.juego = new FizzBuzz();
       for(int i=0;i<arregloDeEnteros.length;i++) {
           arregloDeEnteros[i]=i+1;
       }


  }

    @Test
    public void probarMultiploDeTres() {
        int unNumero = arregloDeEnteros[2];
        System.out.println("El numero en la posición 2 del arreglo es un : "+arregloDeEnteros[2]+" --> retorna "+this.juego.evaluarItem(arregloDeEnteros[2]));
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"Fizz");
    }
    @Test
    public void probarMultiploDeCinco() {
        int unNumero = arregloDeEnteros[4];
        System.out.println("El numero en la posición 4 del arreglo es un : "+arregloDeEnteros[4]+" --> retorna "+this.juego.evaluarItem(arregloDeEnteros[4]));
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"Buzz");
    }
    @Test
    public void probarMultiploDeTresYCinco() {
        int unNumero = arregloDeEnteros[14];
        System.out.println("El numero en la posición 14 del arreglo es un : "+arregloDeEnteros[14]+" --> retorna "+this.juego.evaluarItem(arregloDeEnteros[14]));
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"FizzBuzz");
    }
    @Test
    public void probarNoEsMultiploDeTresYCinco() {
        int unNumero = arregloDeEnteros[15];
        System.out.println("El numero en la posición 3 del arreglo es un : "+arregloDeEnteros[15]+" --> retorna "+this.juego.evaluarItem(arregloDeEnteros[15]));
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"16");
    }


}
