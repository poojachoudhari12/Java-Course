//this Keyword for Method Calling
/*Calling a Method from Another Method Using this: The this keyword can also be used to call another 
  method from the same class without needing to create a new object.
  Use Case: this is useful when you want to ensure you're calling methods on the current object, especially
  in larger programs with multiple methods and objects.
*/

class Apple {
    void mango() {
        System.out.println("Hello mango");
    }

    void nimbu() {
        System.out.println("Hello nimbu");
        this.mango();  // Calling method m() using 'this'
    }
}

public class Demonstration_42 {
    public static void main(String[] args) {
        Apple obj = new Apple();
        obj.nimbu(); // Call method n, which internally calls method m
    }
}
