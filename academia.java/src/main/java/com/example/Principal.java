package com.example;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();


        Eletronico e1 = new Eletronico("Smartphone", 2999.0, 12, 3);
        Roupa r1 = new Roupa("T-Shirt", 89.99, "M", "Preto", 6);
        Alimento a1 = new Alimento("Arroz", 9.99, "2024-12-31", 4);

        carrinho1.adicionarItem(e1);
        carrinho1.adicionarItem(r1);
        carrinho1.adicionarItem(a1);


        Eletronico e2 = new Eletronico("Laptop", 4999.0, 24, 2);
        Roupa r2 = new Roupa("Jaqueta", 299.99, "L", "Azul", 1);
        Alimento a2 = new Alimento("Feijão", 7.99, "2024-11-30", 5);

        carrinho2.adicionarItem(e2);
        carrinho2.adicionarItem(r2);
        carrinho2.adicionarItem(a2);


        System.out.println("Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total: " + carrinho1.calcularTotal());


        System.out.println("\nCarrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total: " + carrinho2.calcularTotal());


        carrinho1.gerarArquivoTexto("carrinho1.txt");
        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}
