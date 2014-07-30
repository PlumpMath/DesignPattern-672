package facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		Screen screen = new Screen();
		Projector projector = new Projector();
		DvdPlayer dvdPlayer = new DvdPlayer();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(screen,
				projector, dvdPlayer);

		// start watch movie
		homeTheater.watchMovie();

		// end movie
		homeTheater.endMovie();
	}

}
