package snakeIsa;

import java.awt.Color;
import java.awt.Graphics;

public class Rect {
	private Color color;
	private int X;
	private int Y;
	private int Width;
	private int Height;
	
	public Rect(Color color, int x, int y, int width, int height) {
		super();
		this.color = color;
		X = x;
		Y = y;
		Width = width;
		Height = height;
	}	
	
	public void paint(Graphics g) {
		g.getColor();
		g.fillRect(X, Y, Width, Height);
	}	
	
	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}
	
	public Color getColor() {
		return color;
	}
	
	}
