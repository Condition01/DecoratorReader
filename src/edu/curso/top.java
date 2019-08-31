package edu.curso;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class top {
	public static void main(String[] args) {
		Readerz leitura = new FileInputStreamClass();
		leitura = new InputStreamReaderDec(leitura);
		leitura = new BufferedReaderDec(leitura);
		
		leitura.read();
	}
}
