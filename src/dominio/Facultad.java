
package dominio;
import java.util.ArrayList;
public class Facultad {
   
private String Facultad;
private Director director; //relacion de 1 a 1: la facultad tiene 1 solo director
private ArrayList<Carrera> carrera = new ArrayList<>(); // relacion: una facultad tiene diferentes  carreras
private ArrayList<Profesor> profesor = new ArrayList<>(); // relacion: una facultad tiene distintos  profesores

public Facultad(String Facultad, Director director) {
    this.Facultad = Facultad;
    this.director = director;
    }
public void añadirCarrera(Carrera carrera1) {
    carrera.add(carrera1);
    }

public void añadirProfesor(Profesor profesor1) {
    profesor.add(profesor1);
}
}