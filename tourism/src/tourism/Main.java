package tourism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		building building = new building(25.0);
		int[] hours = {9,17};
		int[] hours2 = {10,18};
		Cultural cultural = new Cultural(hours, 22.0);
		String type = "Chambre";
		Accomodation accomodation = new Accomodation(type, 3, 50, 35);
		String taste = "Historic";
		Museum museum = new Museum(taste, 3, hours2, 15.0);
		
		System.out.println(building.toString());
		System.out.println(cultural.toString());
		System.out.println(museum.toString());
		
		int unity = 2;
		
		cultural.price = cultural.price(unity);
		accomodation.price = accomodation.price(unity);
		
		System.out.println("après modif :");
		
		System.out.println(building.toString());
		System.out.println(cultural.toString());
		System.out.println(museum.toString());
		System.out.println(accomodation.toString());
		
	}

}
