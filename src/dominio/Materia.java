
package dominio;
import java.util.ArrayList;
public class Materia {
private String Materia;
private Profesor profesor; // relacaion: una materia tiene 1 un solo Ingeniero
private ArrayList<Estudiante> estudiante = new ArrayList<>(); //relacion: una materia tiene demasiados estudiantes   
public Materia(String Materia, Profesor profesor) {
    this.Materia = Materia;
    this.profesor = profesor;
}
public void agregaEstudiante(Estudiante carrera1) {
    estudiante.add(carrera1);
    }
}

 