// aaron estrada
package profe;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class leer {
    public static void main(String[] args) {
        File archivo = new File("Persona.txt");
        try{
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream leer;
            while(fis.available() > 0){
                leer = new ObjectInputStream(fis);
                persona PersonaLeida = (persona) leer.readObject();
                System.out.println(PersonaLeida);
            }
        }catch(Exception e){
            System.out.println("Error al Leer archiivo. "+e.getMessage());
        }
    }
}
