package exercises;

import java.util.List;

public class Snake {

	boolean venomous;
	List<Snake> sss;

	public Snake(boolean venomous) {
		this.venomous = venomous;
		
	}
	
	public Snake(List<Snake> sss) {
		this.sss = sss;
		
	}

	public int getNumberOfVenomousSnakes() {
		int v = 0;
		for (Snake snake : sss) {
			if(snake.venomous) v++;
		}
		return v;
	}
	
	public void addSnakes(List<Snake> snakes) {
		for (Snake snake : snakes) {
			sss.add(snake);
		}
	}
}
