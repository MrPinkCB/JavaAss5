package testbankaccount;

	//Importing libraries
import java.awt.event.*; 
import javax.swing.*;   

class BankTeller implements ActionListener 
{
    
    BankAccount obj1;
    JFrame frame;
    JLabel lbName,lbAccountNumber, lbTransaction,lb2Name,lb2AccountNumber, lb2Transaction, lbDisplayName,lbDisplayAccountNumber, lbDisplayTransaction;
    JTextField tfName,tfAccountNumber, tfTransection;
    JButton btnSubmit;
    public BankTeller()
    {
        frame = new JFrame("BankTeller"); // Initializing name
        
        //Initializing labels, text fields and button
        lbName=new JLabel("Enter Name : "); 
        lbAccountNumber=new JLabel("Enter Account Number : ");
        lbTransaction = new JLabel("Enter Transaction : ");
        btnSubmit=new JButton("Submit");
        
        tfName= new JTextField();
        tfAccountNumber= new JTextField();
        tfTransection= new JTextField();
        
        
        lb2Name=new JLabel("Name : "); 
        lb2AccountNumber=new JLabel("Account Number : ");
        lb2Transaction = new JLabel("Transaction : ");
        
        
        lbDisplayName=new JLabel(""); 
        lbDisplayAccountNumber=new JLabel("");
        lbDisplayTransaction = new JLabel("");
        
        
        
        
        // Setting bounds
        lbName.setBounds(120,80, 100,20);  
        tfName.setBounds(260,80, 130,20);  
        lbAccountNumber.setBounds(120,120, 150,20);  
        tfAccountNumber.setBounds(260,120, 130,20);  
        lbTransaction.setBounds(120,160, 130,20);  
        tfTransection.setBounds(260,160, 130,20);  
          
        btnSubmit.setBounds(150,200, 130,20);  
        
        lb2Name.setBounds(120,240, 100,20);  
        lbDisplayName.setBounds(260,240, 100,20);  
        lb2AccountNumber.setBounds(120,280, 130,20);  
        lbDisplayAccountNumber.setBounds(260,280, 100,20);  
        lb2Transaction.setBounds(120,320, 100,20);  
        lbDisplayTransaction.setBounds(260,320, 100,20);  
        
        
        
        //Adding labels, text fields and button into frame
        frame.add(lbName);  
        frame.add(tfName);   
        frame.add(lbAccountNumber);  
        frame.add(tfAccountNumber);  
        frame.add(lbTransaction);  
        frame.add(tfTransection);
        frame.add(btnSubmit);
        
        frame.add(lb2Name);  
        frame.add(lbDisplayName);   
        frame.add(lb2AccountNumber);  
        frame.add(lbDisplayAccountNumber);  
        frame.add(lb2Transaction);  
        frame.add(lbDisplayTransaction);
        btnSubmit.addActionListener(this);
        
        frame.setSize(500,500);  //Setting frame Size
        frame.setLocationRelativeTo(null); // Setting center location
        frame.setLayout(null);   //Setting layout of Frame
        frame.setVisible(true);  // making frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // enabling closing functionality
    

        
    }    
    @Override
        public void actionPerformed(ActionEvent e)
        {  
            obj1 = new BankAccount();
            if(e.getSource()==btnSubmit)
            {
                //storing value in object of BankAccount class
                obj1.Name=tfName.getText();
                obj1.AccountNumber=tfAccountNumber.getText();
                obj1.CurrentAmount=tfTransection.getText();
                
                //storing value of object of BankAccount class into label
                lbDisplayName.setText(obj1.getName());
                lbDisplayAccountNumber.setText(obj1.getAccountNumber());
                lbDisplayTransaction.setText(obj1.getCurrentAmount());
            }
        }
}

public class TestBankAccount {
    
    public static void main(String[] args) {      
        BankTeller b1 = new BankTeller();
    }
    
}
