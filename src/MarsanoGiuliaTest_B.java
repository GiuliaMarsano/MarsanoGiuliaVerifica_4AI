import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MarsanoGiuliaTest_B {

	@BeforeEach
	void setUp() throws Exception {
		System.out.print("eseguito prima di ogni test ");
		System.out.println("istanza oggetto");
		MarsanoGiuliaClass c= new MarsanoGiuliaClass();
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		
		MarsanoGiuliaClass c=new MarsanoGiuliaClass();
		assertEquals(60, c.MarsanoMet(3,5)); //sintetico
		//Risultato ottenuto:0
	}
	
	@Test
	void test1() {
		//fail("Not yet implemented");
		
		MarsanoGiuliaClass c=new MarsanoGiuliaClass();
		assertEquals(120, c.MarsanoMet(4,6)); //sintetico
		//Risultato ottenuto:0
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
		
		MarsanoGiuliaClass c=new MarsanoGiuliaClass();
		assertEquals(336, c.MarsanoMet(6,8)); //sintetico
		//Risultato ottenuto:0
	}

}
