package ru.DZ.second;


public class Main {
    public static void main(String[] args) {

        String a, b;
        a = "liza_DRAGdiller";
        b = "liza_DRAGdiller";
        System.out.println(a == b);

        a = new String("liza_DRAGdiller");
        b = new String("liza_DRAGdiller");
        System.out.println(a == b); // разные классы, которые возваращают одинаковые строки

        b = a;
        System.out.println(a == b);


//        Hero archer = new Archer();
//        Hero swordsman = new Swordsman();
//        archer.speak();
//        swordsman.speak();
        /*
        Action[] heroes = {
                new Archer(123),
                new Swordsman(23),
                new Archer(33),
                new Swordsman(222),
        };
        for (Action h: heroes) {
            System.out.print(h.speak1() + " ");
            System.out.println(h.getHealth());
        }
        */
        /*
        Hero[] heroes = {
                new Archer(123),
                new Swordsman(23),
                new Archer(33),
                new Swordsman(222),
        };

        for (Hero h: heroes) {
            System.out.print(h.speak() + " ");
            System.out.println(h.getHealth());
        }
        */


//        MyClass obj1 = new MyClass(), obj2 = new MyClass();
//        obj1.f();
//        obj2.f();
//        obj1.f();


//        Employee person = new Employee();
//        person.age = 5;
    }
}

class Polygon {
    float[] x, y;
    public Polygon(float[] x, float[] y){
        this.x = x;
        this.y = y;
    }
    public Polygon(Polygon p){
        this(p.x, p.y);
    }

    public void draw(){/*...*/}
    public void rotate(float deg){/*...*/}
}

/*
abstract class Animal {
    public abstract String speak();
}

class Cat extends Animal{
    public String speak(){
        return "Miy";
    }
}

class Dog extends Animal{
    public String speak(){
        return "Gav";
    }
}
*/


/*
class PrivateVar{
    private int var;

    public int getVar() {
        return var;
    }

    public void setVar
            (int var) {
        this.var = var;
    }

}
*/
/*
interface Action{
    public String speak1();
    public int getHealth();

}

class Archer implements Action {
    private final int health;
    public Archer(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String speak1() {
        return "Im Archer!";
    }
}

class Swordsman implements Action {
    private final int health;

    public Swordsman(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public String speak1() {
        return "Im Swordsman!";
    }
}
*/
//////////////////////
/*
abstract class Hero{
    private final int health;

    public Hero(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract String speak();
}

class Archer extends Hero {
    public Archer(int health) {
        super(health);
    }

    public String speak() {
        return "Im Archer!";
    }
}

class Swordsman extends Hero {
    public Swordsman(int health) {
        super(health);
    }

    public String speak() {
        return "Im Swordsman!";
    }
}
*/
//////////////////////////////////
/*
class MyClass {
    static int index = 0;
    public static void f() {
        index++;
        System.out.print(index + " ");
    }
}
*/

/*
abstract class Animal{
    public abstract void speak();
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Miy");
    }
}
*/

/*
class Base{
    void f(){

    }
}
class Derived extends Base{
    protected void f(){

    }
}
*/

/*
interface Drawable{
    public void draw();
}

class MyClass implements Drawable {

    public boolean drawing;
    @Override
    public void draw() {
    }
    public void start() {
    }
    public void stop() {
    }
}*/


/*
abstract class Animal{
    public abstract String eat();
}

class Dog extends Animal {
    @Override
    public String eat() {
        return "Bone";
    }
}*/



/*
class Person{
    public String name;
    public int age;
}

class Employee extends Person {
    public String company;

    public void work(){
    }

    public void relax(){
    }
}
 */