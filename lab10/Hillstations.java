import java.util.*;
class HillStation {
	public void location()
	{
		System.out.println("trip in hillStation");
	}
	public void famousfor()
	{
		System.out.println("shimla");
	}
}

class Manali extends HillStation {

	public void location()
	{
		super.location();
		System.out.println("trip in manali");
	}
	public void famousfor()
	{
		super.famousfor();
		System.out.println("Heaven is a place Manali");
	}

}

class Mussoorie extends HillStation {
	public void location()
	{
		super.location();
		System.out.println("trip in Mussoorie");
	}
	public void famousfor()
	{
		super.famousfor();
		System.out.println("Queen of river Gongotri");
	}



}

class Gulmarg extends HillStation {

	public void location()
	{
		super.location();
		System.out.println("trip in Gulmarg");
	}
	public void famousfor()
	{
		super.famousfor();
		System.out.println("cool climate in Kashmir");
	}


	public static void main(String[] args) {
		System.out.println("Enter name of the hill station Manali/Mussoorie/Gulmarg:");
	
		Scanner sc = new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		String choice = sc1.nextLine();

		HillStation hillStation;
		switch (choice) {
		case "manali":
			hillStation = new Manali();
			break;
		case "mussoorie":
			hillStation = new Mussoorie();
			break;
		case "gulmarg":
			hillStation = new Gulmarg();
			break;
		default:
			System.out.println("Exit the location");
			return;
		}

		hillStation.location();
		hillStation.famousfor();
	}

}
