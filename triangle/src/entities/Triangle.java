package entities;

public class Triangle {

	private float[] side = new float[3];
	
	

	public Triangle() {
		side[0]=1;
		side[1]=1;
		side[2]=1;
	}
	public Triangle(float side1, float side2, float side3) {

		if (side1 <= 0) {
			side[0] = 1;
		} else {
			side[0] = side1;
		}
		if (side2 <= 0) {
			side[1] = 1;
		} else {
			side[1] = side2;
		}
		if (side3 <= 0) {
			side[2] = 1;
		} else {
			side[2] = side3;
		}

	}

	public float[] getSide() {
		return side;
	}

	public void setSide(float[] side) {
		this.side = side;
	}

	public String PossibleTriangle() {
		if (side[0] > side[1] + side[2] && side[1] > side[0] + side[2] && side[2] > side[1] + side[0]) {
			return "That's not a triangle";
		} else {
			return "It's possible to do this triangle";
		}
	}
	
	public String Type() {
		
		if(side[0]==side[1]&&side[1]==side[2]) {
			return "Equilatero";
			
		}
		else if(side[0]==side[1]||side[1]==side[2]||side[0]==side[2]){
			return  "Isóceles";	
		}
		else {
			return "Escaleno";
		}
				
		
	}

}
