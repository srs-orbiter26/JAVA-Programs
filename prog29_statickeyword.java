class Player_1{
    String name;
    int id;

    private static int playerCount=0;

    Player_1(String name){
        this.name=name;
        id=++playerCount;
    }

    static int getPlayerCount(){
        return playerCount;
    }
}
public class prog29_statickeyword {
    public static void main(String[] args){
        System.out.println(Player_1.getPlayerCount());
        Player_1 p1=new Player_1("abc");
        System.out.println(Player_1.getPlayerCount());
    }
}
