import java.awt.*;
import java.awt.event.*;
import java.awt.Font.*;
class Calculator extends WindowAdapter implements ActionListener
{
Frame f;
Button b[]=new Button[10];
Button B[]=new Button[10];
double n1,n2,count;
double xd;
TextField tf,tf1;
	Calculator(String s)
	{	
		f=new Frame(s);
		Font ff = new Font("Arjun",Font.BOLD,30);
		Font ff1 = new Font("Arjun",Font.BOLD,15);
         Font MyFont;
		for(int i=0;i<b.length;i++)
		b[i]=new Button(i+"");
	
		b[1].setBounds(10,250,100,50);
		b[2].setBounds(110,250,100,50);
	     b[3].setBounds(210,250,100,50);
		b[4].setBounds(10,300,100,50);
		b[5].setBounds(110,300,100,50);
	     b[6].setBounds(210,300,100,50);
		 b[7].setBounds(10,350,100,50);
	     b[8].setBounds(110,350,100,50);
		b[9].setBounds(210,350,100,50);
		b[0].setBounds(110,400,100,50);
	
		for(int i=0;i<b.length;i++)
		b[i].addActionListener(this);
	for(int i=0;i<b.length;i++)
		f.add(b[i]);
	for(int i=0;i<b.length;i++)
	  b[i].setFont(ff);
f.addWindowListener(this);
B[6]=new Button("%");
  B[6].setBounds(10,200,100,50);
  B[7]=new Button("+/-");
  B[7].setBounds(110,200,100,50);
B[8]=new Button("CE");
 B[8].setBounds(210,200,100,50);
B[9]=new Button("/");
  B[9].setBounds(310,200,100,50);
 B[0]=new Button(".");
  B[0].setBounds(210,400,100,50);
 B[5]=new Button("=");
  B[5].setBounds(310,400,100,50);
  B[5].setBackground(Color.RED);
B[1]=new Button("back");
 B[1].setBounds(10,400,100,50);
B[2]=new Button("+");
  B[2].setBounds(310,350,100,50);
B[3]=new Button("-");
  B[3].setBounds(310,300,100,50);
B[4]=new Button("x");
  B[4].setBounds(310,250,100,50);
  for(int i=0;i<B.length;i++)
  f.add(B[i]);
for(int i=0;i<B.length;i++)
B[i].setFont(ff);
  for(int i=0;i<B.length;i++)
	  B[i].addActionListener(this);
		tf=new TextField();
		tf.setBounds(10,40,400,50);
		f.add(tf);
		tf.setFont(ff);
		tf1=new TextField();
		tf1.setBounds(10,90,400,50);
		f.add(tf1);
		tf1.setFont(ff1);
		f.setLayout(null);
		f.setSize(420,460);
		f.setVisible(true);
	}
public void windowClosing(WindowEvent e) {
  f.dispose();
}
public void actionPerformed(ActionEvent e)
{
	String z,sw,s,s1,s2,s3,s4,v,d,zt;
	for(int j=0;j<b.length ;j++){
		for(int i=0;i<B.length ;i++)
			if(e.getSource()==B[i]){
	B[i].setBackground(Color.GREEN);
	B[5].setBackground(Color.RED);
			b[j].setBackground(null);}
   else if (e.getSource()==b[j]){
	b[j].setBackground(Color.GREEN);
	B[5].setBackground(Color.RED);
	B[i].setBackground(null);}}
	
if(e.getSource()==b[1]){
 zt=tf.getText();
  z=zt+"1";
  tf.setText(z);
}
if(e.getSource()==b[2]){
zt=tf.getText();
z=zt+"2";
tf.setText(z);
}
if(e.getSource()==b[3]){
  zt=tf.getText();
  z=zt+"3";
  tf.setText(z);
}
if(e.getSource()==b[4]){
  zt=tf.getText();
  z=zt+"4";
  tf.setText(z);
}
if(e.getSource()==b[5]){
  zt=tf.getText();
  z=zt+"5";
  tf.setText(z);
}
if(e.getSource()==b[6]){
  zt=tf.getText();
  z=zt+"6";
  tf.setText(z);
}
if(e.getSource()==b[7]){
  zt=tf.getText();
  z=zt+"7";
  tf.setText(z);
}
if(e.getSource()==b[8]){
  zt=tf.getText();
  z=zt+"8";
  tf.setText(z);
}
if(e.getSource()==b[9]){
  zt=tf.getText();
  z=zt+"9";
  tf.setText(z);
}
if(e.getSource()==b[0]){
  zt=tf.getText();
  z=zt+"0";
  tf.setText(z);
}
if(e.getSource()==B[0]) 	
{  
	v=tf.getText();
  s=v+".";
   tf.setText(s);
}
if(e.getSource()==B[1]){         // FOR  BACKSPACE
  zt=tf.getText();
  s=tf1.getText();
  try{
    z=zt.substring(0, zt.length()-1);
	 v=s.substring(0, s.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  tf.setText(z);
}
if(e.getSource()==B[7]) 	
{  
	v=tf.getText();
  s="-"+v;
   tf.setText(s);
}
if(e.getSource()==B[2])  
	{
	v=tf.getText();
  s=v+"+";
   tf1.setText(s);
   try{
	   n1=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("Enter Number");
      return;
    }                                                  
  z=" ";
  tf.setText(z);
  count=1;
}
if(e.getSource()==B[3])  	
{  
	v=tf.getText();
  s=v+"-";
   tf1.setText(s);
   try{
    n1=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("Enter Number");
      return;
    }                                        
  z=" ";
  tf.setText(z);
   count=2;
}
if(e.getSource()==B[4])  	
{  
	v=tf.getText();
  s=v+"x";
   tf1.setText(s);
   try{
    n1=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("Enter Number");
      return;
    }
                                                        
  z=" ";
  tf.setText(z);
  count=3;
}
if(e.getSource()==B[6])  	
{  
	v=tf.getText();
  s=v+"";
   tf1.setText(s);
   try{
    n1=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("Enter Number");
      return;
    }                                           
  z=" ";
  tf.setText(z);
  count=5;
}
if(e.getSource()==B[9])  	
{  
  v=tf.getText();  
  s=v+"/";
   tf1.setText(s);
   try{
    n1=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("Enter Number");
      return;
    }                                                  
  z=" ";
  tf.setText(z);
  count=4;
}
if(e.getSource()==B[5]){          
  try{
	   n2=Double.parseDouble(tf.getText());
    }catch(Exception f){
      System.out.println("ENTER NUMBER FIRST ");
	return;}
 if(count==1)
 {
	 s1=tf1.getText();
	   s1=String.valueOf(n1);
    s2=String.valueOf(n2);
 s3=String.valueOf(xd);
 s4=s1+"+"+s2+"=";
    xd =n1+n2;
	tf1.setText(String.valueOf(s4));
	tf.setText(String.valueOf(xd));
 }
 else if(count==2)
  {
	  s1=tf1.getText();
	   s1=String.valueOf(n1);
    s2=String.valueOf(n2);
 s3=String.valueOf(xd);
 s4=s1+"-"+s2+"=";
    xd =n1-n2;
	tf1.setText(String.valueOf(s4));
	tf.setText(String.valueOf(xd));
  }
 else if(count==3)
  {
	  s1=tf1.getText();
	   s1=String.valueOf(n1);
    s2=String.valueOf(n2);
 s3=String.valueOf(xd);
 s4=s1+" x "+s2+"=";
    xd =n1*n2;
	tf1.setText(String.valueOf(s4));
	tf.setText(String.valueOf(xd));
  }
else if(count==4)
{
	s1=tf1.getText();
	   s1=String.valueOf(n1);
    s2=String.valueOf(n2);
 s3=String.valueOf(xd);
 s4=s1+" / "+s2+"=";
 xd =n1/n2; 
}
 else if(count==5)
 {
	 s1=tf1.getText();
	   s1=String.valueOf(n1);
    s2=String.valueOf(n2);
 s3=String.valueOf(xd);
 s4=s1+" % "+s2+"=";
    xd =n1%n2;    
 }
  
}
if(e.getSource()==B[8]){
  n1=0;
  n2=0;
 count=0;
  xd=0;
   z="";
   tf.setText(z);
   tf1.setText(z);
}
}
public static void main(String args[])
{
new Calculator("Calculator");
}
}













