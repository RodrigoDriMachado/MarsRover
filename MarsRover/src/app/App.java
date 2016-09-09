package app;

public class App {

	private static Rover rover1;
	private static Rover rover2;
	
    public static void main(String[] args) {
    	
    	/*
    	 * private static int N = 1;
	private static int E = 2;
	private static int S = 3;
	private static int W = 4;
    	 */

    	rover1 = new Rover();
    	rover2 = new Rover();
        rover1.setPosicao(1, 2, 1);
        rover2.setPosicao(3, 3, 2);
        
        rover1.processaComando("LMLMLMLMM");
        rover2.processaComando("MMRMMRMRRM");
        
        System.out.println("SAIDA ROVER 1");
        rover1.printPosicao();
        System.out.println("SAIDA ROVER 2");
        rover2.printPosicao();
        
    }
}