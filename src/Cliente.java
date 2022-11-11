/*clase que hara herencia para crear los objetos con sus constructores, setters
y getters
*/
public class Cliente {
    String usuarioC;
    String contrasenaC;

    public Cliente(String usuarioC, String contrasenaC) {
        this.usuarioC = usuarioC;
        this.contrasenaC = contrasenaC;
    }

    public String getUsuarioC() {
        return usuarioC;
    }

    public void setUsuarioC(String usuarioC) {
        this.usuarioC = usuarioC;
    }

    public String getContrasenaC() {
        return contrasenaC;
    }

    public void setContrasenaC(String contrasenaC) {
        this.contrasenaC = contrasenaC;
    }
    
    
}
