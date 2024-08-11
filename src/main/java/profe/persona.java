
package profe;


import java.io.*;
import java.io.Serializable;

public class persona implements Serializable{
    private String Profesor;
    private String Alumno;
    private String Carta;

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public String getCarta() {
        return Carta;
    }

    public void setCarta(String Carta) {
        this.Carta = Carta;
    }
    
    public String toString(){
        return  "Profesor: "+Profesor+" Alumno:  "+Alumno+" Carta: "+Carta+'}';
    }
}
