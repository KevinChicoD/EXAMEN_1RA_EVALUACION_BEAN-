package contra;

public class Password {
private String usuario;
private String contrasenia;
    
public Password() {
        usuario = "admin";
        contrasenia = "admin123";
    }

    public boolean verificarAcceso(String usuario2, String contrasenia2) {
        return usuario.equals(usuario2) && contrasenia.equals(contrasenia2);
    }

    public void setUsuario(String usuario) {
        usuario = "admin";
    }

    public void setContrasenia(String contrasenia) {
        contrasenia = "admin123";
    }    
}
