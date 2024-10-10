public class player extends DiceCup{
    String name;
    
    player (String name) {
        this.name = name;
    }
    void setName(String input){
        this.name = input;
    }
    String getName(){
        return this.name;
    }
}