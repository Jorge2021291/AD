package buf;

import java.io.*;

public class LeerFichTextoBuf {
    public static void main(String[] args) {
        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\caracteres\\demo.txt");
        BufferedReader fEntrada = null;

        try{
            fEntrada = new BufferedReader(new FileReader(fichero));

            String linea;
            while((linea = fEntrada.readLine()) != null){
                System.out.printf(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }finally {
            if (fEntrada != null){
                try{
                    fEntrada.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
