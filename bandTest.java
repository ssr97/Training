
public class bandTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band band1 = new Band();
		String singers[] = {"bleh", "meh"};
		String guitarists[] = {"bleh1", "meh1"};
		band1.setBandDetails( "ACDC", singers,guitarists , "Dbone", "Keyboi");
		band1.printBandDetails();
		
		Band band2 = new Band();
		String singers1[] = {"bleh2", "meh2", "hai"};
		String guitarists1[] = {"henlo", "friends", "chaipilo"};
		band2.setBandDetails( "Linkin Park", singers1,guitarists1 , "Dbone2", "Keyboi2");
		band2.printBandDetails();
		
		int band1_artists = band1.guitarists.length+ band1.singers.length+2;
		int band3_artists = band2.guitarists.length+ band2.singers.length+2;
		if(band1_artists > band3_artists)
			System.out.println(band1.bandName+" has more artists");
		else if(band1_artists < band3_artists)
			System.out.println(band2.bandName+" has more artists");
		else
			System.out.println("Both have same number of artists");
	}
	
	
}
