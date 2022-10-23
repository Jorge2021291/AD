package pkg0;

import java.io.*;

public class Act10 {

        String rutaLogo = "C:\\Users\\Jorge\\Downloads\\logo-java.png";
        String rutDestino = "C:\\Users\\Jorge\\OneDrive\\Documents\\Documentos";

        try{
            File inFile = new File(rutaLogo);
            File outFile = new File(rutDestino);

            FileInputStream in = new FileInputStream(inFile);
            FileOutputStream out = new FileOutputStream(outFile);

            int c;
            while( (c = in.read() ) != -1)
                out.write(c);

            in.close();
            out.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        public static void main(String args[]) {
            if(args.length == 2)
                new FileCopy(args[0], args[1]);
            else
                System.out.println("Debe ingresar dos parametros");
        }

    }

}
