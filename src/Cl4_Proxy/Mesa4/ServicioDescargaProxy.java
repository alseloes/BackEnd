package Cl4_Proxy.Mesa4;

public class ServicioDescargaProxy implements  Descarga {
    @Override
    public void descargarTema(String tema,String tipoUsuario) {
        if (usuarioHabilitado(tipoUsuario)) {
            ServicioDescarga servicio = new ServicioDescarga();
            servicio.descargarTema(tema,tipoUsuario);
        }
    }
    public boolean usuarioHabilitado(String tipo)
    {
        return tipo.equals("Premium");
    }
}
