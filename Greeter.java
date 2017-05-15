import javax.swing.JOptionPane;
//The JOptionPane library when imported shows the message in a dialog box
//Class creates a greeter object
//We declare a class with public so that other objects and classes can access it
public class Greeter {

public void sayHello()
//This method is declared using public so other classes using the Greeter class can access it.
{
  JOptionPane.showMessageDialog(null, "Hello, World!", "Greeter", JOptionPane.INFORMATION_MESSAGE);
}

}
