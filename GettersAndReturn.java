
class HumanBeing {
    String name;
    int age;

    void speak() {
        System.out.println("hello");
    }

    int calculateYearsToRequirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class GettersAndReturn {
    public static void main(String[] args) {
        HumanBeing hb = new HumanBeing();
        hb.age = 21;
        hb.name = "Jopay";
        int years = hb.calculateYearsToRequirement();

        System.out.println("years till retirement: " + years);

        int age = hb.getAge();
        String name = hb.getName();

        System.out.println("age is " + age);
        System.out.println("name is " + name);

    }
}
