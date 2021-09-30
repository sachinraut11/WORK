//class definition
class classDemo{
      int  num1;
      int  num2;
      //constructor
classDemo(){
         num1 = 100;
         num2 = 250;
 System.out.println("Inside ClassDemo::Constructor");
     }
  
public void display(){
System.out.println("num1 = "+ num1);
System.out.println("num2 = "+ num2);
    }
}
class Main{
public static void main(String args[]){
classDemo cd1 = new classDemo();    //create object of ClassDemo
cd1.display();
  }
}