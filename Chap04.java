public class Chap04 {

    // instance fields (private)
    private int chapter = 4;
    private String topic;

    // constructor
    public Chap04(String topic) {
        System.out.println("Constructor called");
        this.topic = topic; // this keyword
    }

    // used when we print the object
    public String toString() {
        return "Topic: " + topic + "; Chapter: " + chapter;
    }

    // getter & setter methods
    public int getChapter() {
        return chapter;
    }

    public String getTopic() {
        return topic;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    // main method
    public static void main(String[] args) {
        // create an object of class Chap04
        Chap04 obj = new Chap04("OOP");
        System.out.println(obj);
        System.out.println(obj.getTopic());
        obj.setTopic("Object-Oriented Programming");
        System.out.println(obj);

        // Food Classes
        Omelet omelet = new Omelet("Cheese Omelet", 300, "Paprika", "Medium");
        System.out.println(omelet);
        omelet.eat();
    }
}

// inheritance
class Food {
    public String name;
    protected int calories;
    private String secretIngredient;// cannot be accessed by child class

    public Food(String name, int calories, String secretIngredient) {
        this.name = name;
        this.calories = calories;
        this.secretIngredient = secretIngredient;
    }

    private char peakSecretIngredient() {
        return secretIngredient.charAt(0);
    }

    public String toString() {
        return "Name: " + name + "; Calories: " + calories + "; Secret Ingredient starts with the letter: "
                + peakSecretIngredient();
    }

    public void eat() {
        System.out.println("Mhmmmm");
    }
}

// sub-class (inheriting from the super-class)
class Omelet extends Food {
    private String size;

    public Omelet(String name, int calories, String secretIngredient, String size) {
        super(name, calories, secretIngredient); // super call to parent class
        this.size = size;
    }

    public String toString() {
        return super.toString() + "; Size: " + size;
    }

    // overriding parent class method
    @Override
    public void eat() {
        System.out.println("Yummy Omelet");
    }
}
