import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
public class text6 extends JFrame{
    private static  long seriaVersionUID=1L;
    public static void main(String[] args)
    {
    	text6_1 demo=new text6_1();
    	demo.setBackground(Color.WHITE);
    	demo.setBounds(10,10,230,230);
    	demo.setTitle("Ð¦Á³");
    	demo.setVisible(true);
    }
}
class text6_1 extends Frame implements WindowListener{
	private static long seriaVersionUID=1L;
    public void paint(Graphics g)
    {
    	g.setColor(Color.blue);
    	g.drawString("Ð¦", 30, 50);
    	g.drawOval(50, 50, 80,80);
    	g.drawArc(70, 80, 14, 7,0, 180);
    	g.drawArc(110, 80, 14, 7, 0,180);
    	g.drawArc(70,110,40,20,180,180);
    }
    text6_1()
    {
    	this.addWindowListener(this);
    }
   
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
    
    
}
     class text6_2 extends Frame implements WindowListener{
    	 text6_2()
    	 {
    		 this.addWindowListener(this);
    	 }
     

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		private static final long seriaVersionUID=1L;
		public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawString("¿Þ!", 30, 50);
			g.drawOval(50, 50, 80, 100);
            g.drawArc(110,80, 14,7,180,180);
            g.drawArc(70, 110, 40, 20,0, 180);
		}












































































-


		

