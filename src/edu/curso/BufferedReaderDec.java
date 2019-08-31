package edu.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDec extends ToppingDecorator{

	private BufferedReader bf;
	
	public BufferedReaderDec(Readerz readin) {
		super(readin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void read() {
		getReadin().read();
		this.bf = new BufferedReader((Reader)getReadin().getSomething());
		System.out.println("\nLendo arquivo...");
		try {
			String line;
			while((line = this.bf.readLine())!= null) {
				System.out.println(line + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Readerz getReadin() {
		return super.getReadin();
	}

	@Override
	public Object getSomething() {
		return this.bf;
	}

	
	
}
