class Player{
    String name;
    int id;

    static int playerCount=0;

    Player(String name){
        this.name=name;
        id=++playerCount;
    }

    void printDetails(){
        System.out.println(id+":"+name);
    }
}

public class prog28_statickeyword {
    public static void main(String[] args){
        Player p1=new Player("Yash");
        Player p2=new Player("Harsh");
        p1.printDetails();
        p2.printDetails();
        System.out.println(Player.playerCount);
        System.out.println(p1.playerCount);
    }
}
