package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen {

	private int[] coordinates = new int[2];
	public List<int[]> possibleCoordinates = new ArrayList<>();

	public Queen(int coordinatesX, int coordinatesY) {

		this.coordinates[0] = coordinatesX;
		this.coordinates[1] = coordinatesY;
		possibleCoordinates.add(this.coordinates.clone());
	}
	
	

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}



	public void setPossibleCoordinates() {
		int[] newCoordinates;

		// Superior Direito
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] < 8 && newCoordinates[1] < 8) {

			newCoordinates[0]++;
			newCoordinates[1]++;
			possibleCoordinates.add(newCoordinates.clone());
		}

		// Superior Esquerdo
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] > 0 && newCoordinates[1] < 8) {
			newCoordinates[0]--;
			newCoordinates[1]++;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// Inferior Direito
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] < 8 && newCoordinates[1] > 0) {
			newCoordinates[0]++;
			newCoordinates[1]--;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// inferior Esquerdo
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] > 0 && newCoordinates[1] > 0) {
			newCoordinates[0]--;
			newCoordinates[1]--;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// Direita
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] < 8) {
			newCoordinates[0]++;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// Esquerda
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[0] > 0) {
			newCoordinates[0]--;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// cima
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[1] < 8) {
			newCoordinates[1]++;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

		// baixo
		newCoordinates = this.coordinates.clone();
		while (newCoordinates[1] > 0) {
			newCoordinates[1]--;
			this.possibleCoordinates.add(newCoordinates.clone());
		}

	}



	@Override
	public String toString() {
		return "Queen [coordinates=" + Arrays.toString(coordinates) + "]";
	}
	
	

}
