package pkg0;

import pkg0.*;

import java.io.*;
import java.nio.file.*;

public class Act10 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Error el número de parametros debe de ser tres <Directorio Origen> <Fichero>");
                System.exit(-1);
            }

            String pathOrigen = "C:\\Users\\Jorge\\Downloads\\logo-java.png";
            String pathDestino = pathOrigen + "backup\\";
            // Define aqui tu directorio destino
            String fichero = "C:\\Users\\Jorge\\OneDrive\\Documents\\";
            File ficheroCopiar = new File(pathOrigen, fichero);
            File ficheroDestino = new File(pathDestino, fichero);
            if (ficheroCopiar.exists()) {
                Files.copy(Paths.get(ficheroCopiar.getAbsolutePath()), Paths.get(ficheroDestino.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
            } else {
                System.out.println("El fichero " + fichero + " no existe en el directorio " + pathOrigen);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}