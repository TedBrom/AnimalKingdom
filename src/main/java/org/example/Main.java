package org.example;

public class Main
{
    public static void main(String[] args)
    {
        // declare constructors and print statements
        System.out.println("Hello world!");

        //Set values for constructors
        Cat myCat = new Cat("Larry", "meow", 9);
        Cat anotherCat = new Cat("Harry", "wow", 3);
        FlyingRat myPigeon = new FlyingRat();


        myCat.eat();
        System.out.println(myCat.getAge());
        System.out.println(myCat.getName());
        System.out.println(myCat.getTalking());

        anotherCat.eat();
        System.out.println(anotherCat.getAge());
        System.out.println(anotherCat.getName());
        System.out.println(anotherCat.getTalking());



        if (!myCat.isDead() && !myPigeon.isDead())
        {
            System.out.println("your pets are fine ");
        }
        else {
            System.out.println("You forgot to feed them!");
        }


        System.out.println(myPigeon.getName());
        if(myPigeon.takeOff())
        {
            System.out.println("Woosh");
            for(int i = 0; i < 10; i++)
            {
                myPigeon.flap();
            }
        }
        else
        {
            System.out.println("Splat");
        }


        myPigeon.flap();
        myPigeon.landing();
        myPigeon.eat();
        myPigeon.poop();

    }



}