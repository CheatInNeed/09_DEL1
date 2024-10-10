public class Player extends DiceCup {
    String name;
    
    public Player(String name) {
        this.name = name;
    }
    public Player() {
        this.name = null;
    }
    void setName(String input){
        this.name = input;
    }
    String getName(){
        return this.name;
    }
}