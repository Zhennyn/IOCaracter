package br.com.java.io;

import java.io.*;
import java.util.Scanner;

public class ExercicioIOCaracter2 {

    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do { 
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo \"%s\" foi criado com sucesso", f.getName());

        pw.close();
        scan.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }

}