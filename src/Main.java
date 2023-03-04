public class Main {
    public static void main(String[] args) {
        Person value = new Person();
        value.name = " Lyapis";
        value.surname = "Trubetskoy";
        changePerson(value);
        System.out.println(value);
    }


    private static void changePerson(Person value) {
        value = new Person();
        value.name = "Ilya";
        value.surname = " Lagutenko";
    }

     public static class Person {

        private String name;
        private String surname;

        public String toString() {
            return name + " " + surname;
        }
    }
}