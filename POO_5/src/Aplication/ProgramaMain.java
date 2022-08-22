package Aplication;

import java.util.Scanner;

import Entidades.Produto;

public class ProgramaMain {

	public static void main(String[] args) {
		
		        // Criar scanner digitando a instanciacao abaixo e clicando (Ctrl+Shift+O)
		
				Scanner sc = new Scanner(System.in);
				
				Produto A = new Produto();
				
				System.out.print("Digite o nome do Produto: ");
				A.nome = sc.nextLine();
				System.out.print("Digite o preco do produto: ");
				A.preco = sc.nextDouble();
				System.out.print("Digite a quantidade: ");
				A.quantidade = sc.nextInt();
				
				System.out.println(A);
				
				int opcao = 1;
				while(opcao!=0) {
				
					System.out.println("Digite 1 para realizar venda, 2 - Para realizar compra"
							+ " ou 0 para sair do sistema");
					opcao = sc.nextInt();
					if(opcao==1) {
						System.out.println("Quantidade a vender: ");
						int venda = sc.nextInt();
						A.removeProduto(venda);
					}
					else if(opcao==2);{
						System.out.println("Quantidade a comprar");
						int compra = sc.nextInt();
						A.addProduto(compra);
					}
					System.out.println(A);
				}
		sc.close();		
	}
	
}
