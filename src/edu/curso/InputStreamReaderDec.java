package edu.curso;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDec extends ToppingDecorator{

	private InputStreamReader ir;
	
	public InputStreamReaderDec(Readerz readin) {
		super(readin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void read() {
		getReadin().read();
		System.out.println("\ncriando fluxo de leitura...");
		this.ir = new InputStreamReader((FileInputStream)getReadin().getSomething());
	}


	@Override
	public Object getSomething() {
		return this.ir;
	}

	

	
	
	
}
