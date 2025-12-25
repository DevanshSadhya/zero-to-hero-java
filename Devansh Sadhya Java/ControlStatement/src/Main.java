//In this example, we are creating a class "Dog". Where, the class attributes are breed, age, and color. The class methods are setBreed(), setAge(), setColor(), and printDetails().
class Dog{
    String breed;
    int age;
    String color;
    //methods
    void setBreed(String breed){
        this.breed = breed;
    }
    void setAge(int age){
        this.age=age;
    }
    void setColor(String color){
        this.color=color;
    }
    void printDetails(){
        System.out.println("Dog Details");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}
class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setBreed("Brown");
        d.setAge(23);
        d.setColor("red");
        d.printDetails();

    }
}
