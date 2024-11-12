package secondModule;

public class Main {
    public static class Cat {
        public void sayHello(){
            System.out.println("Мяу!");
        }
    }

    public static class Dog{
        public void sayHello(){
            System.out.println("Гав!");
        }
        public void catchCat(Cat cat){
            System.out.println("Кошка поймана");
            sayHello();
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.sayHello();
        dog.sayHello();
        dog.catchCat(cat);
    }
}



