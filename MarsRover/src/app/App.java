package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

	private static Rover rover1;
	private static Rover rover2;
	private static Planalto planalto;

	public static void main(String[] args) throws IOException {

		
		
	
		Scanner ler = new Scanner(System.in);
		Path path = Paths.get("Imput");

		try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.defaultCharset()))) {
			String str, pos_rover;
			int pos_x, pos_y, altura_planalto, largura_planalto;
			sc.useDelimiter("[./;n]"); // separadores: ; e nova linha
			// int i =0;
			String[] aux;
			while (sc.hasNext()) {
				
				//Le os dados para criação do planalto
				str = sc.nextLine();
				aux = str.split(" ");
				altura_planalto = Integer.parseInt(aux[0]); 
				largura_planalto = Integer.parseInt(aux[1]);
				planalto = new Planalto(altura_planalto, largura_planalto);
				
				//Le os dados para criar o primeiro Rover
				str = sc.nextLine();
				str = sc.nextLine();
				aux = str.split(" ");
				str = aux[0];
				pos_x = Integer.parseInt(str);
				str = aux[1];
				pos_y = Integer.parseInt(str);
				pos_rover = aux[2];
				rover1 = new Rover(pos_x, pos_y, pos_rover, planalto);
				
				//Processa o comando para movimentar o Rover 1
				str = sc.nextLine();
				str = sc.nextLine();
				rover1.processaComando(str);
				
				//Le os dados para criar o segundo Rover
				str = sc.nextLine();
				str = sc.nextLine();
				aux = str.split(" ");
				str = aux[0];
				pos_x = Integer.parseInt(str);
				str = aux[1];
				pos_y = Integer.parseInt(str);
				pos_rover = aux[2];
				rover2 = new Rover(pos_x, pos_y, pos_rover, planalto);
		
				//Proceassa o comando para movimentar o Rover 2
				str = sc.nextLine();
				str = sc.nextLine();
				rover2.processaComando(str);
				
				//Imprimi as posições
				System.out.println("SAIDA ROVER 1");
				System.out.println(rover1.getPosicao());
				System.out.println("");
				System.out.println("SAIDA ROVER 2");
				System.out.println(rover2.getPosicao());
				
			}
		}

	}
}