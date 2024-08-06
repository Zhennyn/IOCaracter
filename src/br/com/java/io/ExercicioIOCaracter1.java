package br.com.java.io;

import java.io.*;

public class ExercicioIOCaracter1 {
    public static void receberTecladoImprimirConsole() throws IOException {
        System.out.println("Recomende 3 filmes: ");
        // InputStream is = System.in;
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();

        // OutputStream os = System.out;
        // OutputStreamWriter osw = new OutputStreamWriter(os);
        // BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do { 
            bw.write(line);
            bw.newLine();
            line = br.readLine();
            

        } while (!(line.isEmpty()));
        bw.flush();

        br.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
}
