Projeto-1 Java

Objetivo:

Implementar um sistema de vendas de produtos utilizando conceitos de programaçãoorientada a objetos: métodos, encapsulamento, construtores, herança, interfaces, classesabstratas e tratamento de exceções.

Descrição:

Você deverá criar um sistema para gerenciar diferentes tipos de produtos. O sistema deve sercapaz de gerenciar informações sobre eletrônicos, roupas e alimentos, exibindo detalhesespecíficos para cada tipo de produto. Além disso, o sistema deve permitir a adição, remoção elistagem de produtos, bem como a emissão de um pequeno relatório em arquivo de texto.

1. Criação de Classes e Interfaces
1. Interface Produto
   ○ Métodos:
   ■ public String getTipo();
   ■ public String getNome();
   ■ public double getPreco();
   ■ public void setNome(String nome);
   ■ public void setPreco(double preco);
   ■ public void setQuantidade(int quatidade);
   ■ public int getQuantidade();
   ■ public String exibirDetalhes();
2. Classe abstrata ProdutoBase
   ○ Implementa a interface Produto.
   ○ Atributos:
   ■ private String nome;
   ■ private double preco;
   ■ private int quantidade;
   ○ Métodos:
   ■ Implementar todos os métodos da interface Produto.
   ■ Métodos concretos:
   ■ public ProdutoBase(String nome, double preco, int
   quantidade)
   ■ public ProdutoBase()
   ■ Métodos abstratos:
   ■ public abstract String exibirDetalhes();
3. Classe Eletronico
   ○ Herda de ProdutoBase.
   ○ Atributos adicionais:
   ■ private int garantiaMeses;
   ○ Métodos:
   ■ Construtores:
   ■ public Eletronico(String nome, double preco, int
   garantiaMeses, int quantidade)
   ■ public Eletronico()
   ■ public int getGarantiaMeses();
   ■ public void setGarantiaMeses(int garantiaMeses);
   ■ Implementar o método exibirDetalhes(), exibindo e retornando todas
   as informações do eletrônico.
   ■ public String getTipo(), retornando "Eletrônico".
4. Classe Roupa
   ○ Herda de ProdutoBase.
   ○ Atributos adicionais:
   ■ private String tamanho;
   ■ private String cor;
   ○ Métodos:
   ■ Construtores:
   ■ public Roupa(String nome, double preco, String
   tamanho, String cor, int quantidade)
   ■ public Roupa()
   ■ public String getTamanho();
   ■ public void setTamanho(String tamanho);
   ■ public String getCor();
   ■ public void setCor(String cor);
   ■ Implementar o método exibirDetalhes(), exibindo todas as informações
   da roupa.
   ■ public String getTipo(), retornando "Roupa".
5. Classe Alimento
   ○ Herda de ProdutoBase.
   ○ Atributos adicionais:
   ■ private String dataValidade;
   ○ Métodos:
   ■ Construtores:
   ■ public Alimento(String nome, double preco, String
   dataValidade, int quantidade)
   ■ public Alimento();
   ■ public String getDataValidade();
   ■ public void setDataValidade(String dataValidade);
   ■ Implementar o método exibirDetalhes(), exibindo todas as informações
   do alimento.
   ■ public String getTipo(), retornando "Alimento".
6. Classe CarrinhoDeCompras
   ○ Atributos:
   ■ private List<Produto> itens;
   ■ demais atributos para escrita de arquivo de texto.
   ○ Métodos:
   ■ Construtor:
   ■ public CarrinhoDeCompras(), inicializando a lista de itens.
   ■ public void adicionarItem(Produto produto), para adicionar um
   produto ao carrinho.
   ■ public void removerItem(Produto produto), para remover um
   produto do carrinho.
   ■ public void listarItens(), para exibir os detalhes de todos os
   produtos no carrinho.
   ■ public List <Produto> exportarListaProdutos(), para devolver
   a lista de produtos do carrinho.
   ■ public double calcularTotal(), para calcular o valor total dos
   produtos no carrinho.
   Obs.: para excluir um item da lista de produtos do carrinho, talvez seja
   necessário buscar pelo seu nome e quantidade, visto que não temos um
   identificador único para esse caso.
   ■ public void gerarArquivoTexto(String nomeArquivo).
   Esse método deverá gravar um arquivo de texto com o formato similiar ao
   exemplo abaixo: