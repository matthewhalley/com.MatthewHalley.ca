public abstract class student implements Categorizable {
    private String name;
    private int age;

    public student() {

    }

    public int getAge() { return age; }                 //Accessor & mutator methods

    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public String toString() {                                      //toString method
        return "Student Name: " + name + "\nAge: " + age;
    }


    public student(String name, int age) {




    }
}
