public class scratch {
    public static void main(String[] args) {
        Person value = new Person();
        value.name = " Lyapis";
        value.surname = "Trubetskoy";
        changePerson(value);
        System.out.println(value);

    }


    private static void changePerson(Person person) {
        //value = new main.Person();
        person.name = "Ilya";
        person.surname = " Lagutenko";
    }

}
class Person {

    String name;
    String surname;

    public String toString() {
        return name + " " + surname;
    }
}


