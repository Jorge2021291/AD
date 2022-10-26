package caracteresPrintWriter;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class EscribirFichTextoPrintWriter {
    public static void main(String[] args) {


        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\caracteres\\fichero.txt");
        ArrayList<personas> personas = new ArrayList<>();

        personas.add(new personas("John", "doe oe", "doe"));
        personas.add(new personas("Jane", "Peterson Peterson", "jane@peterson.com"));
        personas.add(new personas("John", "doe", "doe"));
        personas.add(new personas("John", "doe", "doe"));


//        BufferedWriter fSalida = null;

        try (PrintWriter fSalida = new PrintWriter(fichero)) {
            for (int i = 1; i < 11; i++) {
                fSalida.println("Fila numero: " + i);

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

    public personas(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
