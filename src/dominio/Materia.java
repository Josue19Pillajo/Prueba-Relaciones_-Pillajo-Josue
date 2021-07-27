
package dominio;
import java.util.ArrayList;
public class Materia {
private String nombreMateria;
private Profesor profesor; // relacaion: una materia tiene un solo Ingeniero
private ArrayList<Estudiante> estudiante = new ArrayList<>(); //relacion: una materia tiene demasiados estudiantes   
}
 