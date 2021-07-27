
package dominio;
import java.util.ArrayList;
public class Universidad {
private String nombreDeAlgunaUniversidad;
private ArrayList<Facultad>facultad; //relacion: La universidad tienen varias facultades
public Universidad(String nombreDeUniversidad) {
facultad= new ArrayList<>();//para que sea de composicion
this.nombreDeAlgunaUniversidad = nombreDeAlgunaUniversidad;
}
 public void agregaFacultad(Facultad facultad1) {
    facultad.add(facultad1);
}

}

