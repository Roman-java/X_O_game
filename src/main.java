import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class main {
	public static void main(String[] args) {
		
		System.out.println("Зауск игры");
		JFrame window = new JFrame("X_O");
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setLayout(new BorderLayout());
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		paint game = new paint();
		window.add(game);		
	}
}