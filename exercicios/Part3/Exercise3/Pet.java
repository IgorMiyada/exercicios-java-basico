package Part3.Exercise3;

public class Pet {
    private String name;
    private int age;
    private boolean isItClean;

    public Pet(String name, int age, boolean isItClean) {
        this.name = name;
        this.age = age;
        this.isItClean = isItClean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isItClean() {
        return isItClean;
    }

    public void setItClean(boolean itClean) {
        isItClean = itClean;
    }
}
