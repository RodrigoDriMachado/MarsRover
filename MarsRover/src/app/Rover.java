package app;

public class Rover {

	
	private static int N = 1;
	private static int E = 2;
	private static int S = 3;
	private static int W = 4;
	
	private int pos_rover = N;
	
	private int pos_x;
	private int pos_y;
	
	
	public Rover(){
		
	}
	
	public void setPosicao(int x , int y, int posicao){
		this.pos_x = x;
		this.pos_y = y;
		this.pos_rover = posicao;
	}
	
	public void printPosicao(){
		char pos='N';
		if(pos_rover == 1){
			pos = 'N';
		}
		else if(pos_rover ==2){
			pos='E';
		}
		else if(pos_rover==3){
			pos='S';
		}
		else{
			pos='W';
		}
		System.out.println(this.pos_x + " " + this.pos_y + " " + pos);
		
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
	
	private void moveRover(){
		if(this.pos_rover==N ){
			this.pos_y ++;
		}
		else if(this.pos_rover==S){
			this.pos_y --;
		}
		else if(this.pos_rover==W){
			this.pos_x --;
		}
		else if(this.pos_rover==E){
			this.pos_x ++;
		}
				
	}
	
	private void giraDireita(){
		if(this.pos_rover==N){
			this.pos_rover=E;
		}
		else if(this.pos_rover==E){
			this.pos_rover=S;
		}
		else if(this.pos_rover==S){
			this.pos_rover=W;
		}
		else if(this.pos_rover==W){
			this.pos_rover=N;
		}
	}
	
	private void giraEsquerda(){
		if(this.pos_rover==N){
			this.pos_rover=W;
		}
		else if(this.pos_rover==W){
			this.pos_rover=S;
		}
		else if(this.pos_rover==S){
			this.pos_rover=E;
		}
		else if(this.pos_rover==E){
			this.pos_rover=N;
		}
	}
}
