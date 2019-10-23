public class undergrad extends student {
    String[] subjects;
    String category = "Full Time";

    public undergrad(String name, int age, String category, String[] subjects) {
        super(name, age);
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getCategory() {
        return category;
    }


    @Override
    public void setCategory(String category) {
        this.category = category;
    }
}
