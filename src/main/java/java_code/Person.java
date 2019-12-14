package java_code;

public class Person {
    private int age;
    public  String name;
    private String lastName;
    public Person(int age){
        this.age= age;
        
    }
    public static void  test1(){
        System.out.println("Git practice");
    }
    public static String test2(){
     Person obj = new Person(2);
     return obj.name;
    }

    public static void main(String[] args) {
        String name = "zulfiye";
        System.out.println(name);
    }
}
