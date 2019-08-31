package edu.curso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;

public class ToppingDecorator implements Readerz{

	private Readerz readin;
	
	public ToppingDecorator(Readerz readin) {
		this.readin = readin;
		//read();
	}
	
	
	@Override
	public void read() {
		System.out.println("Preparando para ler arquivo...");
	}
	
	public Readerz getReadin() {
		return readin;
	}

	@Override
	public Object getSomething() {
		// TODO Auto-generated method stub
		return null;
	}
}
