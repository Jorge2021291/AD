package pkg0;

import java.io.*;

public class Act10 {
    public static void main(String args[]) {
        String sourceFile = "C:\\Users\\Jorge\\Downloads\\logo-java.png";
        String destinationFile = "C:\\Users\\Jorge\\OneDrive\\Documents\\Nose\\";
        try {
            File inFile = new File(sourceFile);
            File outFile = new File(destinationFile);

            FileInputStream in = new FileInputStream(inFile);
            FileOutputStream out = new FileOutputStream(outFile);

            int c;
            while( (c = in.read() ) != -1)
                out.write(c);

            in.close();
            out.close();
        } catch(IOException e) {
            System.err.println("Hubo un error de entrada/salida!!!");
        }
    }


}