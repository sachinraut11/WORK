//a class called program is defined
public class Program10
{
//main method is called
public static void main(String args[])
{
//class not found exception is defined using try and catch block
try
{
// the forname method in class class looks for the mentioned class
Class.forName("The Class do not Exist");
}
catch (ClassNotFoundException e)
{
e.printStackTrace();
}
}
}
