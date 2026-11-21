package java_concepts.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A("Praveen" , 20 , new int[20]);

        System.out.println(obj.name);

//        we cannot access varibles that are private
//        System.out.println(obj.age);
        System.out.println(obj.getAge());  // We can access it through the getter method.

    }
}
