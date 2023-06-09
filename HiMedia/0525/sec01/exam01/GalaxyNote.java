package sec01.exam01;

public class GalaxyNote extends CellPhone{

	public GalaxyNote(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void drawPicture() {
		System.out.println("그림을 그립니다.");
	}
}
