package practice_10;

/**
 * Created by lwan on 24/07/2017.
 */
public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id,String name, int age) {
       this.id=id;
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String introduce(){
        return "My name is "+this.name+", I am "+this.age+" years old.";
    }

    public boolean isSameTo(Person person1) {
        return this.id==person1.id;
    }
}
