package facade;

public class HomeTheaterFacade {
	
	private Screen screen;
	
	private Projector projector;
	
	private DvdPlayer dvdPlayer;
	
	
	public HomeTheaterFacade(Screen screen, Projector projector, DvdPlayer dvdPlayer) {
		this.screen = screen;
		this.projector = projector;
		this.dvdPlayer = dvdPlayer;
	}
	
	public  void watchMovie() {
		screen.down();
		projector.on();
		dvdPlayer.on();
	}
	
	public void endMovie() {
		dvdPlayer.off();
		projector.off();
		screen.up();
	}

}
