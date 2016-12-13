import static org.junit.Assert.*;

import org.junit.Test;



public class resta {

	@Test
	public void testRes(){
		
		assertEquals(2, rest(4,2));
		
	}
	
	
	int rest(int a, int b){
		return a-b;
	}

}
