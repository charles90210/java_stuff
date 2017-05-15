//Creating a class and an object.

public class HelloApp2 //our class begins here
{
  public static void main(String[] args) //must be included in all java apps
  {
    Greeter myGreeterObject = new Greeter();
    //This a variable created to hold objects from the greeter classs
    /*new Greeter() is an object created from the Greeter class and
    assigned to the variable myGreeterObject */
    myGreeterObject.sayHello();
    //this is a method from the Greeter class inherited by the object as an instance of that class
}
}
