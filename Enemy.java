public class Enemy {
    // instance variables
    private int health;

    void Speak(){
        System.out.println("I am an Enemy");
        System.out.println("I will Attack You");
    }

    public void getHealth(){
        System.out.println("Health is: "+health);
    }

    public void setHealth(int health){
        this.health = health;
    }
}