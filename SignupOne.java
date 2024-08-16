package bank.management.system;

import javax.swing.*;//swing package is used for to create frame using function JFrame
import java.awt.*;//awt package to get all methods imported here
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;//actionlistener is under awt event package

public class SignupOne extends JFrame implements ActionListener
{
    long random;
    //it will tell that we have clicked on button
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, citytextfield, pintextfield, statetextfield;
    //globally defined button of jbutton
    JButton next;
    //globally defined radio button
    JRadioButton male, female,other, married, unmarried;
    JDateChooser datechooser;
    SignupOne()//signupone class constructor
    {
        setLayout(null);//we have set swing default layout as null so we can use our custom layout label.setBounds().
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO: "+random);//to add the text on frame
        formno.setFont(new Font("Raleway",Font.BOLD,38));//to add the font to text on frame
        formno.setBounds(130,20, 600, 40);//text size
        add(formno);//to show that text on frame
        
        
        JLabel personaldetails = new JLabel("Page 1: Personal Details");//to add the text on frame
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));//to add the font to text on frame
        personaldetails.setBounds(290,80,400,30);//text size
        add(personaldetails);//to show that text on frame
        
        
        JLabel name = new JLabel("Name:");//to add the text on frame
        name.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        name.setBounds(100, 140, 100, 30);//text size
        add(name);//to show that text on frame
        
        nametextfield = new JTextField();//to add the field box where to insert info
        nametextfield.setFont(new Font("Raleway",Font.BOLD,20));//to add font
        nametextfield.setBounds(300,140,380,30);//box length height
        add(nametextfield);//and show to frame
        
        JLabel fname = new JLabel("Father's Name:");//to add the text on frame
        fname.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        fname.setBounds(100, 190, 180, 30);//text size
        add(fname);//to show that text on frame
        
        fnametextfield = new JTextField();//to add the field box where to insert info
        fnametextfield.setFont(new Font("Raleway", Font.BOLD,20));//to add font
        fnametextfield.setBounds(300,190,380,30);        //box length height
        add(fnametextfield);//and show to frame
        
        JLabel dob = new JLabel("Date Of Birth:");//to add the text on frame
        dob.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        dob.setBounds(100, 240, 180, 30);//text size
        add(dob);//to show that text on frame
        
        datechooser = new JDateChooser();
        datechooser.setForeground(Color.BLACK);//calender foreground color
        datechooser.setBounds(300,240,380,30);
        add(datechooser);//to show on frame
        
        JLabel gender = new JLabel("Gender:");//to add the text on frame
        gender.setFont(new Font("raleway",Font.BOLD,20));//to add the font to text on frame
        gender.setBounds(100, 290, 100, 30);//text size
        add(gender);//to show that text on frame
        
        male = new JRadioButton("Male");//adding male to radio button
        male.setBackground(Color.WHITE);//background color of male button
        male.setBounds(300, 290, 60, 30);//text size
        add(male);//to show that text on frame
        
        female = new JRadioButton("Female");//adding female to radio button
        female.setBackground(Color.WHITE);//background color of male button
        female.setBounds(400, 290, 90, 30);//text size
        add(female);//to show that text on frame
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");//to add the text on frame
        email.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        email.setBounds(100, 340, 180, 30);//text size
        add(email);//to show that text on frame
        
        emailtextfield = new JTextField();//to add the field box where to insert info
        emailtextfield.setFont(new Font("raleway",Font.BOLD,20));////to add font
        emailtextfield.setBounds(300, 340, 380, 30);//box length height
        add(emailtextfield);//to show that text on frame
        
        JLabel status = new JLabel("Marital Status:");//to add the text on frame
        status.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        status.setBounds(100, 390, 180, 30);//text size
        add(status);//to show that text on frame
        
        married = new JRadioButton("Married");//add married to radio button
        married.setBackground(Color.WHITE);//that button background color
        married.setBounds(300,390,100,30);//button size
        add(married);//showing on frame
        
        unmarried = new JRadioButton("Unmarried");//add unmarried to radio button
        unmarried.setBackground(Color.WHITE);//that button background color
        unmarried.setBounds(450, 390, 100, 30);//button size
        add(unmarried);//showing on frame
        
        other = new JRadioButton("Other");//add other to radio button
        other.setBackground(Color.WHITE);//that button background color
        other.setBounds(630,390,100,30);//button size
        add(other);//showing on frame
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");//to add the text on frame
        address.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        address.setBounds(100,440,100,30);//text size
        add(address);//showing on frame
        
        addresstextfield = new JTextField();//to add the field box where to insert info
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,20));//to add font
        addresstextfield.setBounds(300,440,380,30);//box length height
        add(addresstextfield);//showing on frame
        
        JLabel city = new JLabel("City:");//to add the text on frame
        city.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        city.setBounds(100,490,100,30);//text size
        add(city);//showing on frame
        
        citytextfield = new JTextField();//to add the field box where to insert info
        citytextfield.setFont(new Font("Raleway",Font.BOLD,20));//to add font
        citytextfield.setBounds(300,490,380,30);//box length height
        add(citytextfield);//showing on frame
        
        JLabel pin = new JLabel("Pin Code:");//to add the text on frame
        pin.setFont(new Font("Raleway",Font.BOLD,20));//to add the font to text on frame
        pin.setBounds(100,540,180,30);//text size
        add(pin);//showing on frame
        
        pintextfield = new JTextField();//to add the field box where to insert info
        pintextfield.setFont(new Font("Raleway",Font.BOLD,20));//to add font
        pintextfield.setBounds(300,540,380,30);//box length height
        add(pintextfield);//showing on frame
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 590, 100, 30);
        add(state);
        
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,20));
        statetextfield.setBounds(300,590,380,30);
        add(statetextfield);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);//frame size
        setLocation(350,10);//to crete frame in centre
        setVisible(true);//to see frame
        
    }
       public void actionPerformed(ActionEvent ae)
       {
           String formno = "" + random; //long value
           String name = nametextfield.getText();
           String fname = fnametextfield.getText();
           String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
           String gender  = null;
           if(male.isSelected())
           {
               gender = "Male";
           } else if(female.isSelected())
           {
                gender = "female";
           }
           String email = emailtextfield.getText();
           String marital = null;
           if(married.isSelected())
           {
               marital = "Married";
           }
           else if(unmarried.isSelected())
           {
               marital = "Unmarried";
           }
           else if(other.isSelected())
           {
               marital = "other";
           }
           String address = addresstextfield.getText();
           String city = citytextfield.getText();
           String state = statetextfield.getText();
           String pin = pintextfield.getText();
           
           try
           {
               if(name.equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Name is Required");
               }
               else
               {
                   Conn c = new Conn();
                   String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                   c.s.executeUpdate(query);
               }
           }catch(Exception e)
           {
               System.out.println(e);
           }
           }
    public static void main(String[] args) 
    {
        new SignupOne(); //signup class object
    }
    
}
