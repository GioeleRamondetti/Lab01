package it.polito.tdp.parole.model;

import java.util.*;


public class Parole {
	private List<String> parole;
	public Parole() {
		this.parole=new ArrayList<String>();
		//TODO
	}
	
	public void addParola(String p) {
		this.parole.add(p);
		//TODO
	}

	public void removeParola(String p) {
		this.parole.remove(p);
		//TODO
	}

	public List<String> getElenco() {
		//TODO
		Collections.sort(this.parole,new Comparatore());
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
		
		// TODO
	}

}
