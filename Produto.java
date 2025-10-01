// package com.fatec.poo.Produto;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols; 
import java.util.Locale;       

public class Produto {
    
    //atributos
    private String nome;
    private double preco;
    private int qtdEstoque;
    private String codigo;
    
    // CONSTRUTOR (Sem o ponto e vírgula!)
    public Produto (String nome, double preco, int qtdEstoque, String codigo){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.codigo = codigo;
    }

    // MÉTODO DE EXIBIÇÃO CORRIGIDO E FORMATADO
    public void exibirDetalhes(){
 
        DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        
        System.out.println("--- DETALHES DO PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + df.format(preco));
        System.out.println("Em Estoque: " + qtdEstoque + " unidades");
        System.out.println("Código: " + codigo);
        System.out.println("---------------------------");
    
        System.out.println("--- ESTOQUE ---");

    }
}