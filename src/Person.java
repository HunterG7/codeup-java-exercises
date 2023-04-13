public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("Hello, %s.%n", name);
    }

    public Person(String name){
        this.name = name;
    }
    public Person(){}

    public static void main(String[] args) {
        Person person1 = new Person("Hunter");
        person1.sayHello();

        Person person2 = new Person();
        person2.setName("Nick");
        person2.sayHello();




    }


}
