public class PersonTwo {
  public static void main(String[] args) {
    ConstructorWithoutMethod myObj = new ConstructorWithoutMethod();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

/* lines 4 and 5 explain how to access private atributes from a class, with get and set.
Use the ConstructorTwo.java and PersonTwo.java to compare the situations and see the differences. 
In the ConstructorTwo.java, we don't need to use get and set because we've already had done
in the ConstructorOne.java a method that inherits the private atributs. But in PersonOne.java
We didnt' do a method, we've created a method just in PersonTwo.java. To be able to use this atributs
in PersonTwo.java, we need to use myObj.setName and myObj.getName().
*/

