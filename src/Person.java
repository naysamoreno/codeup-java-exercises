public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
       return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;


    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(){}

    public static void main(String[] args) {
        Person testPerson = new Person("Naysa");
        System.out.println(testPerson.getName());
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}

