package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeFactory {

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {

		List<Snake> snakes = new ArrayList<Snake>();
		for (int i = 0; i < 1000; i++) {
			snakes.add(new Snake(new Random().nextBoolean()));
		}

		return snakes;
	}
}
