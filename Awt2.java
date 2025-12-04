import java.awt.*;    
    
class Awt2 {    
    
   Awt2() {  
   
      Frame f = new Frame();  
      Label l = new Label("Employee id:");   
      Button b = new Button("Submit");  

        TextField t = new TextField();  
      l.setBounds(10, 80, 100, 20);  
      t.setBounds(30, 100, 100, 40);  
      b.setBounds(100, 140, 80, 30);  
  
      f.add(b);  
      f.add(l);  
      f.add(t);  
  
      f.setSize(400,300);  
  
      f.setTitle("Employee info");   
           
      f.setLayout(null);   
  
      f.setVisible(true);  
}    
  
   
public static void main(String args[]) {   
  
Awt2 obj = new Awt2();    
  
}  
  
}    