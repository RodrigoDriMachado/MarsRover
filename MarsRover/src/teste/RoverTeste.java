package teste;

import org.junit.*;

import app.Rover;
import app.Planalto;

import static org.junit.Assert.*;


public class RoverTeste {
	
	Rover rover1;
	Rover rover2;
	Planalto planalto;
	
	@Before
	public void setUp() {
		planalto = new Planalto(5, 5);
		rover1 = new Rover(1, 2, "N", planalto);
		rover2 = new Rover(3,3,"E", planalto);
		
	}
	
	@Test
	public void TestGetPosicaoRover1(){
		rover1.processaComando("LMLMLMLMM");
		assertEquals("1 3 N", rover1.getPosicao());
	}
	
	@Test
	public void TestGetPosicaoRover2(){
		rover2.processaComando("MMRMMRMRRM");
		assertEquals("5 1 E", rover2.getPosicao());
	}
	
	@Test
	public void TestGetPosicaoRover1V2(){
		rover1.processaComando("LMLMLMLMMMMMMMMMM");
		assertEquals("1 5 N", rover1.getPosicao());
	}
}
