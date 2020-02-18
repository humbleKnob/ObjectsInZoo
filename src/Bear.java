public class Bear extends Animal {
    public Bear(String name) {
        super(name, "fish");
    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }
}
//public class Bear extends Animal{
//    String name;
//    String favFood;
//
//
//    public Bear(String name) {
//        this.name = name;
//        this.favFood = "fish";
//    }
//
//    public void sleep() {
//        System.out.println(name + " hibernates for 4 months");
//
//    }
//
//    public void eat(String food) {
//        System.out.println(name + " eats " + food);
//        if(food == favFood){
//            System.out.println("YUM!!! " + name + " wants more " + food);
//        }
//    }
//
//
//}


