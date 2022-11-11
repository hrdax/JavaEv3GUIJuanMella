/*clase que hara herencia para crear los objetos con sus constructores, setters
y getters
*/
public class Admin {
    String usuarioA;
    String contrasenaA;

    public Admin(String usuarioA, String contrasenaA) {
        this.usuarioA = usuarioA;
        this.contrasenaA = contrasenaA;
    }

    public String getUsuarioA() {
        return usuarioA;
    }

    public void setUsuarioA(String usuarioA) {
        this.usuarioA = usuarioA;
    }

    public String getContrasenaA() {
        return contrasenaA;
    }

    public void setContrasenaA(String contrasenaA) {
        this.contrasenaA = contrasenaA;
    }
    
    
}
