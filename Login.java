package bank.management.system;

import javax.swing.*; //swing package is used for to create frame using function JFrame
import java.awt.*;
import java.awt.event.*;//actionlistener is under awt event package

public class Login extends JFrame implements ActionListener // actionlistener is an interface used for to show some action on click of button
{
    JButton login, signup, clear;//globally defined button of jbutton
    JTextField cardTextField;////it will tell that we have clicked on button
    JPasswordField pinTextField;//    /it will tell that we have clicked on button

    Login() //this a constructor
    {
      setTitle("Automated Teller Machine"); // to give title to frame
      
      setLayout(null);//we have set swing default layout as null so we can use our custom layout label.setBounds().
      //imageicon is class to get image using classloader in that we user method like getsystemresource method 
      //to get image using the location
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/logo.jpg"));
      Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);//used for to changed the size of image
      ImageIcon i3 = new ImageIcon(i2);//we have passed image into imageicon class,bcuz image doesnot work with jlabel,so we converted image class ino imageicon icon class using object
      JLabel label = new JLabel(i3);//is a used for to see info on frame
      label.setBounds(70,10,100,100);//to reset location of image we have taken values left, top,heigtht,width
        add(label);//to see frame using add method is used
        
        JLabel text = new JLabel("Welcome to ATM");//to add the text on frame
        text.setFont(new Font("Osward", Font.BOLD, 38));//to apply font on text
        add(text);//and show on frame
        text.setBounds(200,40,400,40);//text length , left,top,height,width
        
        JLabel cardno = new JLabel("Card No: ");//to add the text cardno on frame
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));//font change
        add(cardno);//show the text
        cardno.setBounds(120,150,150,30);// text length
        
        cardTextField = new JTextField();//to add the field box where to insert info
        cardTextField.setBounds(300, 150,230,30);//box length height
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));//to add font
        add(cardTextField);//and show to frame
        
        JLabel pin = new JLabel("PIN: ");//to add the text pin on frame
        pin.setFont(new Font("Raleway", Font.BOLD, 28));// font change
        add(pin);//show the text
        pin.setBounds(120,220,250,30);//set length
        
        pinTextField = new JPasswordField();// to add the field box password
        pinTextField.setBounds(300,220,230,30);//box length
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));//font of content
        add(pinTextField);//show on frame
        
        login = new JButton("SIGN IN");//to add sign in button on frame
        login.setBounds(300,300,100,30);// button length size
        login.setBackground(Color.black);//button background color
        login.setForeground(Color.white);//button foreground color
        login.addActionListener(this);//it will tell that we have clicked on button
        add(login);//to show on frame
        
        clear = new JButton("CLEAR");// to add clear button on frame
        clear.setBounds(430,300,100,30);//button length size
        clear.setBackground(Color.black);//button backround color
        clear.setForeground(Color.white);//button foreground color
        clear.addActionListener(this);//it will tell that we have clicked on button
        add(clear);//to show on frame
        
        signup = new JButton("SIGN UP");// to add signup button on frame
        signup.setBounds(300,350,230,30);//button length size
        signup.setBackground(Color.black);//button background color
        signup.setForeground(Color.white);//button foreground color
        signup.addActionListener(this);//it will tell that we have clicked on button
        add(signup);//to show on frame
        
        
        getContentPane().setBackground(Color.white);//to change the background color of frame
        setSize(800,480); //frame size
        setVisible(true); //used for see frame
        setLocation(350,200); //change the frame from left and top
    }
    
    public void actionPerformed(ActionEvent ae)//abstract method of action listener
    {//action ae will tell which button is clicked
        if(ae.getSource() == clear)//if clear button is clicked
        {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == login)//if login button is clicked
        {
            
        }
        else if(ae.getSource() == signup)//if signup button is clicked
        {
            setVisible(false);
            new SignupOne().setVisible(true); //to show Signup window
        }
    }
    
    public static void main(String[] args)
    {
        new Login(); //Creating class anonymous object
        
    }
    
}
