/*clase que hara herencia para crear los objetos con sus constructores, setters
y getters
*/
public class Perfil {
    String nombreperfil;
    int edadperfil;
    String fechanacimientoperfil;
    String Rutperfil;

    public Perfil(String nombreperfil, int edadperfil, String fechanacimientoperfil, String Rutperfil) {
        this.nombreperfil = nombreperfil;
        this.edadperfil = edadperfil;
        this.fechanacimientoperfil = fechanacimientoperfil;
        this.Rutperfil = Rutperfil;
    }

    public String getNombreperfil() {
        return nombreperfil;
    }

    public void setNombreperfil(String nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    public int getEdadperfil() {
        return edadperfil;
    }

    public void setEdadperfil(int edadperfil) {
        this.edadperfil = edadperfil;
    }

    public String getFechanacimientoperfil() {
        return fechanacimientoperfil;
    }

    public void setFechanacimientoperfil(String fechanacimientoperfil) {
        this.fechanacimientoperfil = fechanacimientoperfil;
    }

    public String getRutperfil() {
        return Rutperfil;
    }

    public void setRutperfil(String Rutperfil) {
        this.Rutperfil = Rutperfil;
    }
    
    
}
