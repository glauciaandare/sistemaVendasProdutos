package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
    }

    public void listarItens() {
        for (Produto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        String directoryPath = "arquivos";
        File directory = new File(directoryPath);

        // Cria o diretório se ele não existir
        if (!directory.exists()) {
            boolean dirCreated = directory.mkdir();
            if (dirCreated) {
                System.out.println("Diretório criado com sucesso: " + directoryPath);
            } else {
                System.err.println("Erro ao criar o diretório: " + directoryPath);
                return;
            }
        } else {
            System.out.println("Diretório já existe: " + directoryPath);
        }


        String filePath = directoryPath + File.separator + nomeArquivo;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            System.out.println("Gerando arquivo: " + filePath);
            int i = 1;
            double total = 0.0;
            for (Produto produto : itens) {
                double subTotal = produto.getPreco() * produto.getQuantidade();
                total += subTotal;
                writer.write(String.format("%d %d %s %.2f %.2f%n", i++, produto.getQuantidade(), produto.getNome(), produto.getPreco(), subTotal));
            }
            writer.write("Total: " + total);
            System.out.println("Arquivo gerado com sucesso: " + filePath);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

}