package nomCorr;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class EscribirFichTextoPrintWriter {
    public static void main(String[] args) {


        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\bufwrrd\\src\\nomCorr\\fichero.txt");
        ArrayList<personas> personas = new ArrayList<>();

        personas.add(new personas("John", "Doe Doe", "john@doe.com"));
        personas.add(new personas("Jane", "Peterson Peterson", "jane@peterson.com"));
        personas.add(new personas("Peter", "Eastwood", "peter@eastwood.com"));
        personas.add(new personas("María", "Pérez Pérez", "maria@perez.com"));


//        BufferedWriter fSalida = null;

        try (PrintWriter fSalida = new PrintWriter(fichero)) {

            for(personas person: personas){
                fSalida.println(person);


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //                } catch (IOException e) {
        //                    throw new RuntimeException(e);
        //                }


    }
}

class personas{
    public String nombre;
    public String apellidos;
    public String email;

    @Override
    public String toString() {
        return nombre + " " + apellidos + " " + email + "\n";
    }

    public personas(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;


    }
}
