package app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Scanner;



public class Rover {

	private Planalto planalto;
	private static int N = 1;
	private static int E = 2;
	private static int S = 3;
	private static int W = 4;
	
	private String pos_rover = "N";
	
	private int pos_x;
	private int pos_y;
	
	
	public Rover(int pos_x , int pos_y, String posicao_ini, Planalto p){
		this.planalto = p;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.pos_rover = posicao_ini;
	}
	
	public void setPosicao(int x , int y, String posicao){
		this.pos_x = x;
		this.pos_y = y;
		this.pos_rover = posicao;
		
	}
	
	public void processaComando(String comando){
		Character aux;
		for(int i =0; i < comando.length();i++){
			aux = comando.charAt(i);
			if(aux.equals('L')){
				giraEsquerda();
			}
			else if(aux.equals('R')){
				giraDireita();
			}
			else if(aux.equals('M')){
				moveRover();
			}
		}
		
	}
	public String getPosicao(){
		return this.pos_x + " " + this.pos_y + " " + this.pos_rover;
	}
	
	private void moveRover(){
		if(this.pos_rover.equals("N") ){
			if(this.pos_y<planalto.getAltura()){
				this.pos_y++;
			}
		}
		else if(this.pos_rover.equals("S")){
			if(this.pos_y>0){
				this.pos_y --;
			}
		}
		else if(this.pos_rover.equals("W")){
			if(this.pos_x>0){
				this.pos_x --;
			}
		}
		else if(this.pos_rover.equals("E")){
			if(this.pos_y < planalto.getAltura()){
				this.pos_x ++;
			}
		}
				
	}
	
	private void giraDireita(){
		if(this.pos_rover.equals("N")){
			this.pos_rover="E";
		}
		else if(this.pos_rover.equals("E")){
			this.pos_rover="S";
		}
		else if(this.pos_rover.equals("S")){
			this.pos_rover="W";
		}
		else if(this.pos_rover.equals("W")){
			this.pos_rover="N";
		}
	}
	
	private void giraEsquerda(){
		if(this.pos_rover.equals("N")){
			this.pos_rover="W";
		}
		else if(this.pos_rover.equals("W")){
			this.pos_rover="S";
		}
		else if(this.pos_rover.equals("S")){
			this.pos_rover="E";
		}
		else if(this.pos_rover.equals("E")){
			this.pos_rover="N";
		}
	}
}
