package br.unipe.cc.util;

import java.util.ArrayList;
import java.util.List;
import br.unipe.cc.modelo.*;

public class Programa {
	public static void main(String[] args) {
		
		List<Item> listaDeItens = new ArrayList<Item>(); 
		
		listaDeItens.add(new Item(2, "Item2"));
		listaDeItens.add(new Item(4, "Item4"));
		listaDeItens.add(new Item(3, "Item3"));
		listaDeItens.add(new Item(1, "Item1"));
		listaDeItens.add(new Item(6, "Item6"));

		Inventario inventario = new Inventario(listaDeItens);
		
		inventario.ordenarItens();
		
		System.out.println(inventario);
	}
}
