public class zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tigger");
        tiger.eat("meat");
        Bear bear = new Bear("Pooh");
        bear.eat("fish");
        bear.eat("meat");
        Unicorn unicorn = new Unicorn("Rarity");
        unicorn.eat("marshmellows");
        Giraffe giraffe = new Giraffe("Gemma");
        giraffe.eat("meat");
        giraffe.eat("leaves");
        Bee bee = new Bee("Stinger");
        bee.eat("meat");
        bee.eat("pollen");
        Zookeeper z = new Zookeeper ("zoobot");
        Animal[] a = { tiger, bear, unicorn, giraffe, bee};
        z.feedAnimals(a, "steak", Animal.population);
    }
}