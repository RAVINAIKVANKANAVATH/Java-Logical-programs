import java.util.*;

class Animal {
  void printA() {
    System.out.println("the animal is hungry");
  }
}

class Dog extends Animal {
  void printB() {
    System.out.println("the Dog is barking");
  }
}

class Practice1 {
  public static void main(String args[]) {
    Dog d = new Dog();
    d.printA();
    d.printB();
  }
}