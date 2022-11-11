/*clase que hara herencia para crear los objetos con sus constructores, setters
y getters
*/
public class Producto {
    String nombreP;
    String tipoP;

    public Producto(String nombreP, String tipoP) {
        this.nombreP = nombreP;
        this.tipoP = tipoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }
    
    
}
