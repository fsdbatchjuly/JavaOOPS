package com.vedait.city;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Hyderabad
		Mumbai
		Delhi
		*/
		
		City hyderabad = new City();
		
		Hospital apollo = new Hospital();
		apollo.address = "Jubliee hills";
		apollo.beds = 100;
		apollo.doctors = 50;
		apollo.name = "Apollo";
		
		RailwayStation secunderabad = new RailwayStation();
		secunderabad.name = "Secunderabad Railwaystation";
		secunderabad.fans = 100;
		secunderabad.ligts = 200;
		secunderabad.noOfPlatforms = 10;
		secunderabad.noOfTrains = 200;
		
		Mall forum = new Mall();
		forum.name = "Forum";
		forum.address = "KPHB";
		forum.fans = 300;
		forum.lights = 200;
		
		PoliceStation jntuP = new PoliceStation();
		jntuP.address = "Kukatpally JNTU";
		jntuP.fans = 50;
		jntuP.lights = 20;
		jntuP.name = "JNTU Police Station";
		
		
		hyderabad.area = 160618;
		
		hyderabad.hospital1 = apollo;
		
		hyderabad.mall1 = forum;
		
		hyderabad.policeStation1 = jntuP;
		
		hyderabad.railwayStation1 = secunderabad;
		
				
		
	
	}

}
