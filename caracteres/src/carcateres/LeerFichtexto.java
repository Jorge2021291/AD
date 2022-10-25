package carcateres;

import java.io.*;

public class LeerFichtexto {
    public static void main(String[] args) {
        File fichero = new File("D:\\Users\\JorgeYu\\Documents\\AD\\UD1\\demos\\caracteres\\idk.txt");

        FileWriter fsalida = null;

        try {
            fsalida = new FileWriter(fichero); //sobreescribe con un true se añade al final
            String cadena = "Esta en una frase sí hay tildes y eñes \n";
            char[] caracteres = cadena.toCharArray();

            //1.escribir caracter a caracter
            for(int i = 0; i < caracteres.length; i++){
                fsalida.write(caracteres[i]);
            }

            fsalida.write("\n");
            fsalida.append("*");

            // 2. Escribir cadena entera
            fsalida.write(cadena);
            String[] provincias = {"Ávila", "Albacete", "Barcelona"};

            for (String provincia: provincias) {
                fsalida.write(provincia);

            }
            fsalida.write("\n");
            fsalida.append("Mensaje").append(" encadena esta");




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(fsalida != null){
                try {
                    fsalida.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }//fin main
}//fin clase
