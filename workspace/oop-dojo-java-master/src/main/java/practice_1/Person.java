package practice_1;

/**
 * Created by lwan on 24/07/2017.
 */
public class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String introuce(){
        return "My name is "+this.name+", I am "+this.age+" years old";
    }
    public String getPersonName(){
        return this.name;
    }
    public int getPersonAge(){
        return this.age;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "My name is "+this.name+", I am "+this.age+" years old";

    }
}
