package exercises;

import java.util.ArrayList;
import java.util.List;

public class Plane {

	private Snake snakes = new Snake(new ArrayList<Snake>());

	public int getNumberOfVenomousSnakes() {
		return snakes.getNumberOfVenomousSnakes();

	}

	public void addSnakes(List<Snake> s) {
		snakes.addSnakes(s);

	}

}
