package snakeIsa;

import java.awt.Dimension;
import java.awt.Point;

public class Cobrinha extends Shape {

	private Direction direction;
	
	public Cobrinha() {
		super(Constants.SNAKE_COLOR);
		
		Point location = new Point(Constants.SNAKE_START_X,Constants.SNAKE_START_Y);
		Dimension dimension = new Dimension(Constants.SNAKE_PIECE_SIZE,Constants.SNAKE_PIECE_SIZE);
		Rect rect = new Rect(location, dimension);
		addRect(rect);
		
		for (int i = 1; i < Constants.SNAKE_INITIAL_SIZE; i++) {
			rect = duplicateRect(rect);
			addRect(rect);
		}
	}
}
