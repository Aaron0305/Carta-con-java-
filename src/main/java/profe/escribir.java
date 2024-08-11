// aaron estrada
package profe;


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class escribir {
     public static void main(String[] args) {
        persona  Persona = new persona();
        Persona.setProfesor("Marcial Jesus Martinez Blaz. ");
        Persona.setAlumno("Aaron estrada martinez. ");
        Persona.setCarta("\nBuenas tardes profe espero y se encuentrebien de salud "
                + "\nme gustaria hacerle unos comentarios para mejorar mas su clase creo sjsj"
                + "\npara mi fue muy entretenida ya que ligre comprender"
                + "\nmuchas cosas interesantes acerca del mundo de la "
                + "\nme gusta como es  su clase por eso estoy simpre"
                + "\npor todo el tiempo y esfuerzo que nos ha desdicado a lo "
                + "\nlargo de estos 2 semestres."
                + "\ne aprendido mucho a lo largo de este tiempo y quisiera que esto continue."
                + "\nMe gustaria que las clese sean mas dinamicas"
                + "\nque logramos comprender de mejor manera mediante la practica"
                + "\na pesar de que la teoria es necesaria estaria mucho mas "
                + "\nque nos  enseñe cosas msa inovadoras o mas actuales."
                + "Gracias ");
        File archivo = new File ("Persona.txt");
        try{
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream escribir = new ObjectOutputStream(fos);
            escribir.writeObject(Persona);
            escribir.close();
            fos.close();
            
        }catch (Exception e){
            System.out.println("Error al Escribir."+e.getMessage());
        }
     }
}
