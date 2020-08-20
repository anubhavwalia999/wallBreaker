package wallBreaker;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args)
	{
		gameplay g11= new gameplay();
	JFrame f1=new JFrame();
    f1.setBounds(10,10,700,600);
    f1.setTitle("wall breaker");
    f1.setResizable(false);
    f1.setVisible(true);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.add(g11);
	}

}
