package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class SignupTwo extends JFrame implements ActionListener
{
    JLabel religion,category,income,education,qualification,occupation,pan,aadhar,senior,existing;
    JRadioButton yes,no,yes1,no1;
    JTextField aadhartextfield,pantextfield;
    JComboBox religiontype,categorytype,incometype,educationtype,occupationtype;
    String formno;
    JButton next;

    SignupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionaldetails = new JLabel("Page 2: Additional Details");//to add the text on frame
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 20));//to add the font to text on frame
        additionaldetails.setBounds(290,80,400,30);//text size
        add(additionaldetails);//to show that text on frame
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,180,220,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religiontype = new JComboBox(valReligion);
        religiontype.setBounds(280,180,400,30);
        religiontype.setBackground(Color.white);
        add(religiontype);
        
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,230,220,30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categorytype = new JComboBox(valCategory);
        categorytype.setBounds(280,230,400,30);
        categorytype.setBackground(Color.white);
        add(categorytype);
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,280, 220, 30);
        add(income);
        
        String valIncome[] = {"Null","< 1,50,000","< 2,00,000","< 5,00,000", "< 10,00,000"};
        incometype = new JComboBox(valIncome);
        incometype.setBounds(280,280,400,30);
        incometype.setBackground(Color.white);
        add(incometype);
        
        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100,330,220,30);
        add(education);
        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,350,220,30);
        add(qualification);
        
        String valEducation[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
        educationtype = new JComboBox(valEducation);
        educationtype.setBounds(280,350,400,30);
        educationtype.setBackground(Color.white);
        add(educationtype);
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD,20));
        occupation.setBounds(100,410,220,30);
        add(occupation);
        
        String valOccupation[] = {"Saleried","Self-Employed","Business","Student","Retired","Other"};
        occupationtype = new JComboBox(valOccupation);
        occupationtype.setBounds(280,410,400,30);
        occupationtype.setBackground(Color.white);
        add(occupationtype);
        
        
        pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD,20));
        pan.setBounds(100,460,220,30);
        add(pan);
        
        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway",Font.BOLD,20));
        pantextfield.setBounds(280,460,400,30);
        add(pantextfield);
        
        aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD,20));
        aadhar.setBounds(100,510,220,30);
        add(aadhar);
        
        aadhartextfield = new JTextField();
        aadhartextfield.setFont(new Font("Raleway", Font.BOLD,20));
        aadhartextfield.setBounds(280,510,400,30);
        add(aadhartextfield);
        
        senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD,20));
        senior.setBounds(100,560,220,30);
        add(senior);
        
        yes = new JRadioButton("Yes");
        yes.setBackground(Color.white);
        yes.setBounds(280,560,100,30);
        add(yes);
        
        no = new JRadioButton("No");
        no.setBackground(Color.white);
        no.setBounds(450,560,100,30);
        add(no);
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(yes);
        seniorGroup.add(no);
        
                 
        existing = new JLabel("Existing Account:");
        existing.setFont(new Font("Raleway", Font.BOLD,20));
        existing.setBounds(100,620,220,30);
        add(existing);
        
        yes1 = new JRadioButton("Yes");
        yes1.setBackground(Color.white);
        yes1.setBounds(280,620,100,30);
        add(yes1);
        
        no1 = new JRadioButton("No");
        no1.setBackground(Color.white);
        no1.setBounds(450,620,100,30);
        add(no1);
        
         ButtonGroup existingGroup = new ButtonGroup();
         existingGroup.add(yes1);
         existingGroup.add(no1);
         
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
       
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,900);//frame size
        setLocation(350,10);//to crete frame in centre
        setVisible(true);//to see frame
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String)religiontype.getSelectedItem();
        String scategory = (String)categorytype.getSelectedItem();
        String sincome = (String)incometype.getSelectedItem();
        String seducation = (String)educationtype.getSelectedItem();
        String soccupation = (String)occupationtype.getSelectedItem();
        
        String aadhar1 = aadhartextfield.getText();
        String pan1 = pantextfield.getText();
        
        String seniorcitizen1 = null;
        if(yes.isSelected())
        {
            seniorcitizen1 = "Yes";
            
        }else if(no.isSelected())
        {
            seniorcitizen1 = "No";
        }
        String existingacc1 = null;
        if(yes1.isSelected())
        {
            existingacc1 = "Yes";
        }else if(no1.isSelected())
        {
            existingacc1 = "No";
        }
        
        
       try
       {
          Conn c = new Conn();
          String query1 = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan1+"','"+aadhar1+"','"+seniorcitizen1+"','"+existingacc1+"')";
          c.s.executeUpdate(query1);
             
           //signup3 object
       }catch(Exception e)
       {
           System.out.println(e);
       }
    }

     
    public static void main(String[] args)
    {
        new SignupTwo("");
    }
    
}
