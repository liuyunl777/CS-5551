package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountryIntroTest {
	String country = "InDia";
	CountryIntro c = new CountryIntro(country);
	String result = c.GenerateIntro();
	String testResult = "India is a vast South Asian country with diverse terrain ¨C from Himalayan peaks to Indian Ocean coastline ¨C and history reaching back 5 millennia. In the north, Mughal Empire landmarks include Delhi¡¯s Red Fort complex and massive Jama Masjid mosque, plus Agra¡¯s iconic Taj Mahal mausoleum. Pilgrims bathe in the Ganges in Varanasi, and Rishikesh is a yoga centre and base for Himalayan trekking.";


	@Test
	public void testGenerateIntro() {
		System.out.println("@Test country: " + country);
		System.out.println(result + " = " + testResult);
		assertEquals(result, testResult);
		
	}

}
