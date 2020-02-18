 public class Unicorn extends Animal {

        public Unicorn(String name) {
            // don't forget to correct the call to the superclass initializer!
            super(name, "marshmellows");
        }
     public void eat(String food) {
         System.out.println(name + " eats " + food);
         if (food == favFood) {
             System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
         }
     }
        public void sleep() {
            // your overridden sleep code...
                System.out.println(name + " sleeps in a cloud");
        }
    }