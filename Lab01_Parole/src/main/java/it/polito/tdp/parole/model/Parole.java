package it.polito.tdp.parole.model;

// import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
		
	List<String> lista;
	
	public Parole() {
		lista = new LinkedList<String>();
		// lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		lista.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		// TODO
		lista.clear();
	}
	
}
