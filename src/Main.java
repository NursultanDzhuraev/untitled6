//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {

        Person person1 = new Person("Aibek", "+996700700700", "kyrgyz", 19);
        Person person2 = new Person("Ernic", "+996700700700", "kyrgyz", 18);
        Person person3 = new Person("Ernic", "+996700700700", "kyrgyz", 17);

        Student student1 = new Student("Aibek2", "+996700700700", "kyrgyz", 11);
        Student student2 = new Student("Aibek2", "+996700700700", "kyrgyz", 12);

        Object[] objects = {person1, person2,person3,student1, student2};
        for (Object object : objects) {

            System.out.println("object.toString() = " + object.toString());

        }
    }
}