package pizzeria;

	//Importing libraries
import java.awt.*; 		
import java.awt.event.*; 
import javax.swing.*;   

class PizzeriaCode implements ActionListener{
    // Creating Frame for interface
    JFrame frame;
    JCheckBox cbSmallpizza, cbMediumpizza, cbLargepizza, cbExtraLargepizza, cbToppingCheese, cbToppingOlives, cbToppingMushrooms, cbToppingPepperoni, cbToppingGreenPepper ;
    JLabel l1,l2;
    JButton btnOrder;
    public PizzeriaCode()
    {
        frame= new JFrame("Pizzeria");  
        // Creating checklist to order from menu
        
        cbSmallpizza = new JCheckBox("Small ($7)");
        cbMediumpizza = new JCheckBox("Medium ($9)");  
        cbLargepizza = new JCheckBox("Large ($11)");  
        cbExtraLargepizza = new JCheckBox("Extra Large ($14)");  
        cbToppingCheese = new JCheckBox("Extra Cheese ($0)");  
        cbToppingOlives = new JCheckBox("Extra Olives ($1)");  
        cbToppingMushrooms = new JCheckBox("Extra Mushrooms ($1)");  
        cbToppingPepperoni = new JCheckBox("Extra Pepperoni ($1)");  
        cbToppingGreenPepper = new JCheckBox("Extra Green Pepper ($1)");  
        
        l1=new JLabel("Pizza Size ");
        l2=new JLabel("Toppings ");
        
        btnOrder = new JButton("Place Order");
        
        // Setting bounds to the components
        
        l1.setBounds(180, 50, 100, 20);
        cbSmallpizza.setBounds(120,80, 100,20);  
        cbMediumpizza.setBounds(240,80, 100,20);  
        cbLargepizza.setBounds(120,120, 100,20);  
        cbExtraLargepizza.setBounds(240,120, 130,20);  

        
        
      l1.setFont(new Font("Verdana", Font.PLAIN, 18));
      l2.setFont(new Font("Verdana", Font.PLAIN, 18));
        l2.setBounds(180, 160, 100, 30);        
        cbToppingCheese.setBounds(100,200, 130,20);  
        cbToppingOlives.setBounds(260,200, 130,20);  
        cbToppingMushrooms.setBounds(100,240, 160,20);  
        cbToppingPepperoni.setBounds(260,240, 150,20);  
        cbToppingGreenPepper.setBounds(140,280, 180,20);  
        
        btnOrder.setBounds(180, 330, 120, 30);
        
        btnOrder.addActionListener(this);
        
        // Adding check box to the frame
        
        frame.add(l1);
        frame.add(l2);
        frame.add(cbSmallpizza);  
        frame.add(cbMediumpizza);   
        frame.add(cbLargepizza);  
        frame.add(cbExtraLargepizza);  
        frame.add(cbToppingCheese);  
        frame.add(cbToppingOlives);   
        frame.add(cbToppingMushrooms);  
        frame.add(cbToppingPepperoni);  
        frame.add(cbToppingGreenPepper);  
        frame.add(btnOrder);
        
        frame.setSize(500,500);  //Setting frame size
        frame.setLocationRelativeTo(null); // Setting center location
        frame.setLayout(null);   //Setting layout of frame
        frame.setVisible(true);  // Making frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Enabling closing functionality
    }
        
        public void actionPerformed(ActionEvent e){  
            float amount=0;  
            String msg="";  
            if(cbSmallpizza.isSelected()){  
                amount+=7;  
                msg+="Small Pizza: $7\n";  
            }  
            if(cbMediumpizza.isSelected()){  
                amount+=9;  
                msg+="Medium Pizza: $9\n";  
            }  
            if(cbLargepizza.isSelected()){  
                amount+=11;  
                msg+="Large Pizza: $11\n";  
            }  
            if(cbExtraLargepizza.isSelected()){  
                amount+=14;  
                msg+="Extra Large Pizza: $14\n";  
            }
            if(cbToppingCheese.isSelected()){  
            	amount+=0;  
                msg+="Extra Cheese Topping: $0\n";  
            }  
            if(cbToppingOlives.isSelected()){  
                amount+=1;  
                msg+="Extra Olives Topping: $1\n"; 
            }  
            if(cbToppingMushrooms.isSelected()){  
                amount+=1;  
                msg+="Extra Mushrooms Topping: $1\n";  
            }  
            if(cbToppingPepperoni.isSelected()){  
                amount+=1;  
                msg+="Extra Pepperoni Topping: $1\n"; 
            }  
            if(cbToppingGreenPepper.isSelected()){  
                amount+=1;  
                msg+="Extra Green Pepper Topping: $1\n"; 
            }  
            if(e.getSource()==btnOrder)
            {
                
                JOptionPane.showMessageDialog(null,msg+"Total: $"+amount);  
            }
            msg+="-----------------\n";  
         
        }
}


public class Pizzeria {

    
    public static void main(String[] args) {       
    PizzeriaCode obj1 = new PizzeriaCode();
    }
    
}
