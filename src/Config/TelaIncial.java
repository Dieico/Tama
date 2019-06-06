package Config;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TelaIncial extends JPanel {
	public static BufferedImage imagei; 
	

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		try {
			imagei = ImageIO.read(new File("/imagens/rQev9.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g2d.drawImage(imagei,10,10, null);
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 30, 30);
		g2d.drawOval(0, 50, 30, 30);
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);

		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
		frame.add(new TelaIncial());
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}