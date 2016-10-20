package com;

public class CountryIntro {
	private String countryName;
	
	public CountryIntro(String country) {
		countryName = country;
	}
	
	public String GenerateIntro() {
		if (countryName.toLowerCase().equals("china")) {
			return "China is a populous nation in East Asia whose vast landscape encompasses grassland, desert, mountains, lakes, rivers and more than 14,000km of coastline. Capital Beijing mixes modern architecture with historic sites such as the Forbidden City palace complex and Tiananmen Square. Shanghai is a skyscraper-studded global financial center. The iconic Great Wall of China runs east-west across the country's north.";
		}
		else if (countryName.toLowerCase().equals("india")) {
			return "India is a vast South Asian country with diverse terrain ¨C from Himalayan peaks to Indian Ocean coastline ¨C and history reaching back 5 millennia. In the north, Mughal Empire landmarks include Delhi¡¯s Red Fort complex and massive Jama Masjid mosque, plus Agra¡¯s iconic Taj Mahal mausoleum. Pilgrims bathe in the Ganges in Varanasi, and Rishikesh is a yoga centre and base for Himalayan trekking.";

		}
		else if (countryName.toLowerCase().equals("america")) {
			return "The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation¡¯s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC. Midwestern metropolis Chicago is known for influential architecture and on the west coast, Los Angeles' Hollywood is famed for filmmaking.";

		}
		else {
			return "Cannot recognize the country name.";
		}
	}

}