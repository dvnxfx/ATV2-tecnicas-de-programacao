// package com.fatec.poo.Produto;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {

        // criando array pra guardar os produtos
        Scanner scanner = new Scanner(System.in);
        Produto[] estoque = new Produto[3];

        System.out.println("--- CADASTRO DE PRODUTOS ---");

        // iteração
        for (int i = 0; i < estoque.length; i++) {
            int numProduto = i + 1;
            System.out.println("\n--- Produto " + numProduto + " ---");

            System.out.println("Digite o nome do produto " + numProduto + ": ");
            String nome = scanner.nextLine();  

            System.out.println("Digite o preço do produto " + numProduto + ": ");
            double preco = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                
            System.out.println("Digite a quantidade em estoque do produto " + numProduto + ": ");
            int qtdEstoque = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o código do produto " + numProduto + ": ");
            String codigo = scanner.nextLine(); 

            // criando objeto 
            estoque[i] = new Produto(nome, preco, qtdEstoque, codigo);
        }

        scanner.close();

        System.out.println("\n##################################");
        System.out.println("--- LISTA DE PRODUTOS ---");
        System.out.println("\n##################################");

        //chamando método
        for (Produto produto : estoque) {
        produto.exibirDetalhes();
     }
   } 
}
