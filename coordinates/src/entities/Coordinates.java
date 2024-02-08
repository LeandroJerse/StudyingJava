package entities;

public class Coordinates {
	private Double x;
	private Double y;
	
    public Coordinates() {
    	this.x = (double) 0;
    	this.y = (double) 0;
    }
	
	public Coordinates(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	public Double Distance(Double x1, Double y1) {
		
		return Math.sqrt(Math.pow(this.x-x1,2)+Math.pow(this.y- y1,2));
		
	}
	
	

}
