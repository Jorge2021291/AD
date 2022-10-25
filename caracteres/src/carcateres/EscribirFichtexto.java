package carcateres;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class EscribirFichtexto {
    public static void main(String[] args) {
        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\caracteres\\idk.txt");

        FileReader fEntrada = null;

        try {
            fEntrada = new FileReader(fichero); //sobreescribe con un true se añade al final

            int i;
            while ((i = fEntrada.read()) != -1){
                System.out.print((char)i);


        }


    }//fin main
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            if(fEntrada != null){
                try {
                    fEntrada.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }//fin clase





    }

