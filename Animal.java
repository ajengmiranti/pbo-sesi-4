class Animal {
    void sound() {
        System.out.println("Binatang akan mengeluarkan suara");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Anjing bersuara : gukguk ");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Kucing bersuara : meow meow ");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        Animal myCat = new Cat(); 
        myDog.sound();  
        myCat.sound();
    }
}
