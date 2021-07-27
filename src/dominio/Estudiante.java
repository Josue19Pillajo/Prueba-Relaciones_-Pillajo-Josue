
package dominio;
import java.util.ArrayList;
public class Estudiante {
private String nombreEstudiante;
private ArrayList<Materia> materia= new ArrayList<>(); //relacion: un estudiante tiene bastantes materias
public void añadirMateria(Materia materia1) {
materia.add(materia1);
    }
}
