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
  }

    @Test
    public void probarMultiploDeTres() {
        int unNumero = 3;
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"Fizz");
    }
    @Test
    public void probarMultiploDeCinco() {
        int unNumero = 5;
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"Buzz");
    }
    @Test
    public void probarMultiploDeTresYCinco() {
        int unNumero = 15;
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"FizzBuzz");
    }
    @Test
    public void probarNoEsMultiploDeTresYCinco() {
        int unNumero = 16;
        Assert.assertEquals(this.juego.evaluarItem(unNumero),"16");
    }


}
