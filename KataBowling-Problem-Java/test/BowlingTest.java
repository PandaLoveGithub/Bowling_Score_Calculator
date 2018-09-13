import static org.junit.Assert.*;

import org.junit.Test;

import Bowling.Player;


public class BowlingTest {
	Player abraham=new Player();
	
	@Test
	public void worstPlayer() {
		abraham.roll(0);
		assertEquals(0,abraham.getTotalScores());
	}
	
	@Test
	public void firstThrowAsSix() {
		abraham.roll(6);
		assertEquals(6,abraham.getTotalScores());
	}
	
	@Test
	public void case_10_2_3_6() {
		abraham.roll(10);
		abraham.roll(2);
		abraham.roll(3);
		abraham.roll(6);
		assertEquals(26,abraham.getTotalScores());
	}
	
	@Test
	public void case_10_10_10_10() {
		for(int i=0;i<4;i++) {
		abraham.roll(10);
		}
		assertEquals(90,abraham.getTotalScores());
	}
	
	@Test
	public void case_10_10_2_8_6_3() {
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(2);
		abraham.roll(8);
		abraham.roll(6);
		abraham.roll(3);
		assertEquals(67,abraham.getTotalScores());
	}
	@Test
	public void case_7_3_8_1_1_9_6_2_10_5_5_8() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(8);
		abraham.roll(1);
		abraham.roll(1);
		abraham.roll(9);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(5);
		abraham.roll(5);
		abraham.roll(8);
		assertEquals(97,abraham.getTotalScores());
	}
	@Test
	public void case_7_3_6_2_10_8_2_10_10_6_1_3_2() {
		//this is the first eight frames, then I will play with the nineth and tenth
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		assertEquals(119,abraham.getTotalScores());
	}
	
	@Test
	public void case_eightFrame_Plus_10_10_6_2() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(2);
		assertEquals(163,abraham.getTotalScores());
	}
	
	@Test
	public void case_eightFrame_Plus_8_2_10_3_2() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(3);
		abraham.roll(2);
		assertEquals(154,abraham.getTotalScores());
	}
	
	@Test
	public void case_eightFrame_Plus_2_5_10_6_2() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		
		abraham.roll(2);
		abraham.roll(5);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(2);
		assertEquals(144,abraham.getTotalScores());
	}
	
	@Test
	public void case_eightFrame_Plus_10_3_5() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		
		abraham.roll(10);
		abraham.roll(3);
		abraham.roll(5);
		assertEquals(145,abraham.getTotalScores());
	}
	@Test
	public void case_eightFrame_Plus_10_3_5_6_7_should_stop_as_145() {
		abraham.roll(7);
		abraham.roll(3);
		abraham.roll(6);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(8);
		abraham.roll(2);
		abraham.roll(10);
		abraham.roll(10);
		abraham.roll(6);
		abraham.roll(1);
		abraham.roll(3);
		abraham.roll(2);
		
		abraham.roll(10);
		abraham.roll(3);
		abraham.roll(5);
		abraham.roll(6);
		abraham.roll(7);
		assertEquals(145,abraham.getTotalScores());
	}
	
	
}
