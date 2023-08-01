package Cl3_ChainOfRespos.Sinc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompruebaMailTest {
    @Test
    public void cadenaSpam(){
        //DADO
        CompruebaMail comprueba= new CompruebaMail();
        Mail mail= new Mail("jorge.pereyra@digitlahouse.com","gerencial@colmena.com","Backend");
        String respEsp= "el mail se fué a Spam";
        //CUANDO
        String respActual= comprueba.compruebaCadena(mail);
        /* ENTONCES */
        Assertions.assertEquals(respEsp,respActual);
    }

}
