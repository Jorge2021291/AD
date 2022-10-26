package buf;

import java.io.BufferedWriter;
import java.io.*;

public class EscribirFichTextobuf {
    public static void main(String[] args) {

        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\caracteres\\demo.txt");
        BufferedWriter fSalida = null;

        try{
            fSalida = new BufferedWriter(new FileWriter(fichero));
            for(int i = 1; i < 11; i++){
                fSalida.write("Fila numero: " + i);
                fSalida.newLine();

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fSalida != null){
                try{
                    fSalida.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
