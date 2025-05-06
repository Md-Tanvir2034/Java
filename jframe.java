import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JFrame;


public class jframe {
    public static void main(String[] args){

        JFrame frame = new JFrame("My First JFrame");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("Picsart_25-02-06_12-21-44-929.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(220 ,25 ,150));
    }
    
}
