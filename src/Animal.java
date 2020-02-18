public class Animal {
    static int population = 0;
    String name;
    String favFood;

    public Animal(String name, String favFood) {
        this.name = name;
        this.favFood = favFood;
        population++;
    }
    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
    }

}