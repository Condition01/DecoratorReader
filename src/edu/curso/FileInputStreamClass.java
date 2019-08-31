package edu.curso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamClass implements Readerz{

	private FileInputStream fs;
	
	@Override
	public void read() {
		String path = "C:\\Users\\BRUNOFERREIRACARDOSO\\Desktop\\text03.txt";
		System.out.println("\nArquivo que será lido : " + path);
		try {
			fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}


	@Override
	public Object getSomething() {
		return this.fs;
	}



	

}
