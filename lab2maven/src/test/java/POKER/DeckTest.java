package POKER;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import POKER.Deck;

public class DeckTest {
	private static Deck Numofcard;
	private static Deck Numofcard1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Numofcard=new Deck(2);
		Numofcard1=new Deck(1);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		public void testNumofcard() {
			assertTrue(Numofcard.getTotalCards()==54);
		}
		public void testNumofcard1() {
		assertFalse(Numofcard.getTotalCards()==54);
		}
		public void testNumofcard2() {
			assertFalse(Numofcard1.getTotalCards()==52);
			}
		public void testNumofcard3() {
			assertTrue(Numofcard1.getTotalCards()==53);
			}
	

	}


