package command;

public class SimpleRemoteControl {

	private Command slot;

	public SimpleRemoteControl() {

	}

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonPressed() {
		slot.execute();
	}

	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(
				garageDoor);

		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonPressed();
		remoteControl.setCommand(garageDoorOpenCommand);
		remoteControl.buttonPressed();
	}

}
