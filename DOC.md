---
marp: true
title: Marp
paginate: true

class: invert
---

### Sistema de Vendas de Produtos
###### Gláucia Andare

---

Este projeto é um sistema de vendas de produtos implementado em Java utilizando conceitos de Programação Orientada a Objetos (POO) como métodos, encapsulamento, construtores, herança, interfaces, classes abstratas e tratamento de exceções.

---

#### Funcionalidades

---

1. **Gerenciamento de Produtos**:
   * Tipos de produtos: Eletrônicos, Roupas e Alimentos.
   * Adição, remoção e listagem de produtos.
   * Emissão de relatórios em arquivo de texto.

---

2. **Classes e Interfaces**:

   * **Interface Produto**: Define métodos para manipulação de produtos.
   * **Classe Abstrata ProdutoBase**: Implementa a interface Produto.
   * **Classe Eletronico**: Herda de ProdutoBase e adiciona atributos específicos.
   * **Classe Roupa**: Herda de ProdutoBase e adiciona atributos específicos.
   * **Classe Alimento**: Herda de ProdutoBase e adiciona atributos específicos.
   * **Classe CarrinhoDeCompras**: Gerencia uma lista de produtos.

---

#### Estrutura de Diretórios

* **src/**: Código-fonte do projeto.
* **arquivos/**: Diretório onde os relatórios em texto serão armazenados.

---


#### Classe Principal

A classe `Principal` cria instâncias de `CarrinhoDeCompras`, adiciona produtos e gera arquivos de relatório.

---

#### Exemplos de Uso

```java
CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
Eletronico e1 = new Eletronico("Smartphone", 2999.0, 12, 3);
Roupa r1 = new Roupa("T-Shirt", 89.99, "M", "Preto", 6);
Alimento a1 = new Alimento("Arroz", 9.99, "2024-12-31", 4);

carrinho1.adicionarItem(e1);
carrinho1.adicionarItem(r1);
carrinho1.adicionarItem(a1);

carrinho1.gerarArquivoTexto("arquivos/carrinho1.txt");
```

---

#### Tratamento de Exceções

O sistema inclui tratamento para possíveis exceções durante a escrita dos arquivos de relatório.

---
#### Requisitos Adicionais

* Utilizar encapsulamento para proteger os atributos das classes.
* Compartilhar a lógica comum entre as classes utilizando herança.
* Implementação modular seguindo boas práticas de POO.

---

Para mais detalhes, consulte a [documentação oficial do Java](https://docs.oracle.com/javase/8/docs/api/java/io/File.html).
