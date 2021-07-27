
package dominio;
import java.util.ArrayList;
public class Profesor {
private String Profesor;
private ArrayList<Materia> materia= new ArrayList<>(); //relacion: un profesor tiene diferentes materias
public void añadirMateria(Materia materia1) {
  materia.add(materia1);
}
}



