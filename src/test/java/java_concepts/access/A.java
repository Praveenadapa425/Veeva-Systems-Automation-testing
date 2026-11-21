package java_concepts.access;

public class A {
    String name;
   // protected int age;
    private int age;
    int[] arr;


    public A() {
    }

    public A(String name, int age, int[] arr){
        this.name = name;
        this.arr = arr;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
