package Cl3_ChainOfRespos.Sinc3;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobar(Mail mail) {

        System.out.println("Lamentamos no poder atenderlo, mail sin novedades ");
        return "el mail se fué a Spam";
    }
}
