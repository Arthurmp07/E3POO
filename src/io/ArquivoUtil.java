package io;

import java.io.*;
import java.util.List;

public class ArquivoUtil {

    public static void salvarEmArquivoTexto(String caminho, List<?> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho))) {
            for (Object obj : lista) {
                writer.write(obj.toString());
                writer.newLine();
            }
            System.out.println("Arquivo salvo com sucesso em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivoTexto(String caminho) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            System.out.println("Conteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
