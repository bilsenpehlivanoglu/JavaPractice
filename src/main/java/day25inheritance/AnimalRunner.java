package day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();//Animals eat...
        c1.drink();//Animals drink...
        c1.meow();//Cats meow...

        Dog d1 = new Dog();
        d1.drink();//Animals drink...
        d1.eat();//Animals eat...
        d1.bark();// Dogs bark...

        Bird b1 = new Bird();
        b1.drink();
        b1.eat();
        b1.tweet();





    }
}
