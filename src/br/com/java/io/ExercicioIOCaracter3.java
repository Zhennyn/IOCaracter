package br.com.java.io;

import java.io.*;

public class ExercicioIOCaracter3 {
    public static void copiarArquivo() throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\Zhennyn\\Desktop\\IOCaracter\\recomendacoes.txt");
        String nomeArquivo = f.getName();

        // Reader r = new FileReader(nomeArquivo);
        // BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));
        do { 
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!(line == null));

        System.out.printf("Arquivo \"%s\" copiado com suscesso!\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com suscesso!", f.getName(), fcopy.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros:");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());
        pw.printf("Tudo certo", fcopy.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo( String arquivo) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do { 
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}