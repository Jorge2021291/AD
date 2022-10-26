package nomCorr;

import java.io.*;
import java.util.Scanner;

public class LeerFichTextoBuf {
    public static void main(String[] args) {
        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\bufwrrd\\src\\nomCorr\\fichero.txt");
        Scanner fEntrada = null;

        try{
            fEntrada = new Scanner(fichero);


            while(fEntrada.hasNext()){
                System.out.printf(fEntrada.next() + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fEntrada != null){
                fEntrada.close();
            }
        }

    }
}
