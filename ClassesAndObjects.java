class Person{

   String name;
   int age;
}

public class ClassesAndObjects {
   public static void main(String[] args) {
    
      Person person1 = new Person();

      person1.name = "john";
      person1.age = 37;

      Person person2 = new Person();

      person2.name = "lloyd";
      person2.age = 45;

      System.out.println(person1.name);
      System.out.println(person2.name);
   } 
}
