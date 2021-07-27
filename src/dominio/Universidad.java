
package dominio;
import java.util.ArrayList;
public class Universidad {
private String nombreDeAlgunaUniversidad;
private ArrayList<Facultad>facultad; //relacion: La universidad tiene varias facultades
public Universidad(String nombreDeUniversidad) {
facultad= new ArrayList<>();//para que sea de composicion
this.nombreDeAlgunaUniversidad = nombreDeAlgunaUniversidad;
}
}
