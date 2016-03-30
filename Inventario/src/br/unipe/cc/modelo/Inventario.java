package br.unipe.cc.modelo;

import java.util.Collections;
import java.util.List;

public class Inventario {
	private List<Item> itens;

	public Inventario(List<Item> itens) {
		this.itens = itens;
	}

	public void ordenarItens(){
		Collections.sort(itens);
	}
	
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Inventario [itens=" + (itens.toArray().length == 0 ? "A listagen dos itens está vázia." : itens) + "]";
	}
	
}
