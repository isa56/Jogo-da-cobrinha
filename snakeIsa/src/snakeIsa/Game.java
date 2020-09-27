package snakeIsa;

public class Game {
	private GameWindow gameWindow;
	private Renderer renderer;
	private Cobrinha cobrinha;
	
	public void start() {
		cobrinha = new Cobrinha();
		gameWindow = new GameWindow();
		renderer = gameWindow.getRenderer();
	
		addElementsToScreen();
		run();
	}
	
	private void addElementsToScreen() {
		renderer.add(new Background());
		renderer.add(cobrinha);
	}
	
	public void run() {
//		do {
//			gameWindow.repaint();
//			
//			try {
//				Thread.sleep(30);
//			} catch(InterruptedException e) {
//			}
//		} while (!isGameOver());
	}
	
	private boolean isGameOver() {
		return false;
	}
	
	
}