package Cl4_Proxy.Mesa4;

public class Usuario {

    private String id;
    private String tipo;
    public Usuario(String id, String tipo)
    {
        this.id=id;
        this.tipo=tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
}
