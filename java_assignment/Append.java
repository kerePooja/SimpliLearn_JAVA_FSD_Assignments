package java_assignment;
	
    import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.Reader;
	import java.nio.file.Files;
	import java.util.Scanner;

	//Write a program to read, write, and append a file 

	public class Append {
		
		public static void main (String[] args) throws IOException
		{
			
			@SuppressWarnings("unused")
			
			FileWriter file = new FileWriter("C:\\Users\\Pooja.txt",true );
			BufferedWriter Bw= new BufferedWriter(file);
			Bw.write("Is my contry");
			@SuppressWarnings("resource")
			BufferedReader Br = new BufferedReader(new FileReader ("C:\\Users\\Poojar.txt"));
			Bw.newLine();
			Bw.close();
			Br.read();
			file.close();
		}

	}

