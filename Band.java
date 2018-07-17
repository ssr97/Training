
public class Band {

	String bandName;
	String singers[], guitarists[], drummer, keyBoardPlayer;
	
	public void setBandDetails(String bandName, String [] singers, String[] guitarists, String drummer, String keyboardPlayer) {
		this.bandName = bandName;
		this.singers = singers;
		this.drummer = drummer;
		this.keyBoardPlayer = keyboardPlayer;
		this.guitarists = guitarists;
	}
	
	public void printBandDetails() {
		System.out.println("Name of the band is "+ bandName+ " the drummer is "+drummer+ " the keyboard player is "+ keyBoardPlayer );
		System.out.println("Following are the guitar players:");
		for(int i = 0; i<guitarists.length ; i++)
			System.out.println(guitarists[i]);
		System.out.println("Following are the singers:");
		for(int i = 0; i<singers.length ; i++)
			System.out.println(singers[i]);
	}
}
