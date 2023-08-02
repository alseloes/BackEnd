package Cl4_Proxy.Mesa4;

public class Main {

    public static void main(String[] args) {
        Usuario usuario= new Usuario("musica@gmail.com","premium");
        Descarga descarga=new ServicioDescargaProxy();
        descarga.descargarTema("Mi tema favorito", usuario.getTipo());
    }
}
