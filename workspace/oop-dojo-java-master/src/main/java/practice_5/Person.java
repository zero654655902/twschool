package practice_5;

/**
 * Created by lwan on 24/07/2017.
 */
public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

   public  String basicIntroduce(){
//       return introduce();
       return "My name is "+this.name+", I am "+this.age+" years old.";
   }
    public String introduce() {
       return basicIntroduce();
//        return "My name is "+this.name+", I am "+this.age+" years old.";
    }
}
