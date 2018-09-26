/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author admin
 */
public class Testfor3 {

    public static void main(String[] args) {
        
        Dog dog= new Dog();
        dog.setname("Husky");
        dog.setsize("Small");
        dog.go();
        
        Cat cat=new Cat();
        cat.setname("mieu");
        cat.setsize("Big");
        cat.go();
        
        Baby baby=new Baby();
        baby.setname("be");
        baby.go();
        
        Bird bird=new Bird();
        bird.setname("Se");
        bird.setsize("small");
        bird.go();
        
        Chiken chicken=new Chicken();
        chiken.setname("congnghiep");
        chiken.setsize("Small");
        chiken.go();
        
        Cow cow=new Cow();
        cow.setname("hihi");
        cow.setsize("Big");
        cow.go();
        
        Duck duck=new Duck();
        duck.setname("Momo");
        duck.setsize("Small");
        duck.go();
        
        Human human=new Human();
        human.setname("Ngoc");
        human.setsize("Big");
        human.go();
        
        Pig pig=new Pig();
        pig.setname("lon");
        pig.setsize("Big");
        pig.go();
        
        Tiger tiger=new Tiger();
        tiger.setname("bio");
        tiger.setsize("Big");
        tiger.go();
    }
}
