class Pokemon{
    // instance variables
    String Name;
    int level;
    int power;

    Pokemon(String Name, int level, int power){
        this.Name = Name;
        this.level = level;
        this.power = power;
    }

    void Attcak(){
        System.out.println(Name+" Attck with Power : "+power);
    }
}
