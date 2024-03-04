public class RunAnimals {
    public static void main(String[] args) {
        Animals tiger = new Animals("Tiger", 9);
        Animals bird = new Animals("Bird", 10);
        Animals snake = new Animals("Snake", 5);

       tiger.setAge(9);
       bird.setAge(10);
       snake.setAge(5);

       System.out.println("Species:" + tiger.getSpecies());
       System.out.println("Age: " + tiger.getAge());

       System.out.println("Species:" + bird.getSpecies());
       System.out.println("Age: " + bird.getAge());

       System.out.println("Species:" + snake.getSpecies());
       System.out.println("Age: " + snake.getAge());
    }
}
