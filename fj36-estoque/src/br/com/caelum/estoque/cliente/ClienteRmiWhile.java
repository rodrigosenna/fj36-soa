package br.com.caelum.estoque.cliente;

import java.rmi.Naming;
import java.util.Scanner;

import br.com.caelum.estoque.rmi.EstoqueRmi;
import br.com.caelum.estoque.rmi.ItemEstoque;

public class ClienteRmiWhile {


	public static void main(String[] args) throws Exception {
		EstoqueRmi estoque = (EstoqueRmi) Naming.lookup("rmi://localhost:1099/estoque");

		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()){
			
			String codigo = scanner.nextLine();
			ItemEstoque produto = estoque.getItemEstoque(codigo);
			System.out.println("Quantidade " + produto.getQuantidade() );
			
		}
		
		System.out.println("ToString " + estoque.toString() );
	}
}