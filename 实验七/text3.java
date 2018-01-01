package 实验七;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.text.DecimalFormat; 
public class text3 extends JFrame 
{ 
TextArea t1; 
List list=new List(10,true); 
public text3(){ 
Panel p=new Panel(); 
Label la1,la2; 
la1=new Label("请选择早点："); 
la1.setBounds(10,5,70,30); 
la2=new Label("您选择了："); 
la2.setBounds(120, 5, 60, 30); 
p.add(la1); 
p.add(la2); 
t1=new TextArea();  
list.setBounds(4,35,80,170); 
p.add(list); 
list.add("名称单价"); 
list.add("*************"); 
list.add("馒头0.20元");
list.add("花卷0.30元"); 
list.add("面包0.50元"); 
list.add("蛋糕0.20元"); 
list.add("豆浆0.80元"); 
list.add("牛奶1.00元"); 
t1=new TextArea(); 
p.add(t1); 
t1.setBounds(90,35,140,140); 
Button b1=new Button("退出"); 
b1.setBounds(120, 177, 70, 30); 
p.add(b1); 
p.setLayout(null); 
item n=new item(); 
myListener m=new myListener(); 
b1.addActionListener(m); 
list.addItemListener(n); 
this.add(p); 
} 
private class myListener implements ActionListener{ 
public void actionPerformed(ActionEvent e)  
  { 
	System.exit(0); 
	} 
} 
private class item implements ItemListener{ 
public void itemStateChanged(ItemEvent e){ 
int a[]; 
String a1[]; 
float sum=0; 
DecimalFormat df=new DecimalFormat("0.00"); 
a1=list.getSelectedItems(); 
a=list.getSelectedIndexes(); 
sum=0; 
t1.setText(" "); 
for(int i=0;i<a1.length;i++){ 
if((a1[i].equals("名称单价"))||a1[i].equals("**************")) 
 {t1.append("");} 
else t1.append(a1[i]+"\n"+" "); 
}
for(int i=0;i<a.length;i++){ 
switch(a[i]){ 
case 2: sum+=0.2f;break; 
case 3: sum+=0.3f;break; 
case 4: sum+=0.5f;break; 
case 5: sum+=0.2f;break; 
case 6: sum+=0.8f;break; 
case 7: sum+=1.0f;break; 
default:break; 
} 
} 
t1.append("\n  共计： "+df.format(sum)+"元"+"\n"); 
} 
 } 
public static void main(String[] args) { 
text3 b=new text3(); 
b.setTitle("自助早餐"); 
b.setBounds(200, 200, 250, 250); 
b.setVisible(true); 
} 
} 
