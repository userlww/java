package  µ—È∆ﬂ;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class text2 extends Panel { 
public static int i=0; 
public static boolean bool=true; 
public static void main(String args[]) 
{
	JFrame f=new JFrame("±‰¡≥"); 
     text2 mb=new text2(); 
     f.add(mb); 
     f.setBounds(200, 200, 200, 220);       
     f.setVisible(true); 
} 
public void paint(Graphics g){ 
g.setColor(Color.blue);  
if(bool){ 
g.drawOval(50,50,80,100); 
g.drawArc(70,80,14,7,0,180); 
g.drawArc(110,80,14,7,0,180); 
g.drawArc(70,110,40,20,180,180); 
g.drawString("–¶£°",30,55); 
} 
else { 
g.drawOval(50,50,80,100); 
g.drawArc(70,80,14,7,180,180); 
g.drawArc(110,80,14,7,180,180); 
g.drawArc(70,110,40,20,0,180); 
g.drawString("øﬁ£°",30,55);  
} 
} 
public boolean mouseUp(Event event,int x, int y){
i++; 
if(i%2==1)
{
	bool=false;repaint();return true;
	} 
else  
{
bool=true; repaint();return true;
} 
} 
} 
