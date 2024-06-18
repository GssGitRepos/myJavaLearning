package Interface;

public class Machine implements info {

	private String name;

	public Machine(String name){
		this.name = name;
		System.out.println("This is a constructor " +  name);

	}
	
	public void running() {
		System.out.println("Machine Started!");
	}

	public void showInfo(){
		System.out.println("This is a Machine!");
	}

}
