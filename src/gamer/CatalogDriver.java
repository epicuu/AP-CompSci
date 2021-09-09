// Victor P. 2020
package gamer;
// import arraylist
import java.util.ArrayList;
public class CatalogDriver {
	public static void main(String [] args) {
		// creating a couple games
		Game halo = new Game ("Halo 5: Guardians", "Xbox One", "Microsoft Studio", 19.99, "0001231413");
		Game hk = new Game("Hollow Knight", "PC", "Team Cherry", 14.99, "551385098");
		Game taxi = new Game("Crazy Taxi", "Dreamcast", "Sega", 7.99, "004314589");
		// print out hollow knight
		System.out.println(hk);
		
		// creating an arraylist to that stores both games
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(halo);
		games.add(hk);
		
		// creating a couple catalogs
		VideoGameCatalog catalog1 = new VideoGameCatalog();
		VideoGameCatalog catalog2 = new VideoGameCatalog(hk);
		VideoGameCatalog catalog3 = new VideoGameCatalog(games);
		// print out the catalogs
		System.out.println("T1: \n" + catalog1 + "\n" + catalog2 + "\n" + catalog3);
		
		// printing out catalog3's getNames
		System.out.println("T2: \n" + catalog3.getNames());
		// adding a game to catalog1 and printing it
		catalog1.addGame(taxi);
		System.out.println(catalog1);
		// removing a game from catalog3 and printing it
		catalog3.removeGame(hk);
		System.out.println(catalog3);
		
		// finding a game in catalog2 that is in there using name + platform
		System.out.println("T3: \n" + catalog2.findGame("Hollow Knight (PC)") + "\n");
		// finding it again via isbn
		System.out.println(catalog2.findGame("551385098") + "\n");
		// trying to find a game that isnt in catalog2
		System.out.println(catalog2.findGame("Halo 5: Guardians (Xbox One)" + "\n"));
		
		// removing a game from catalog2 via name + platform and printing it out
		catalog2.removeGame("Hollow Knight (PC)");
		System.out.println("T4: \n" + catalog2 + "\n");
		// removing a game from catalog1 via isbn and printing it out
		catalog1.removeGame("004314589");
		System.out.println(catalog1 + "\n");
		// trying to remove a game from catalog3 that isnt in there
		catalog3.removeGame("Hollow Knight (PC)");
		}
}
