public class Animals {
    private String species;
    private int age;
    public Animals(String species, int age){
        this.species = species;
        this.age = age;
    }

    public String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
