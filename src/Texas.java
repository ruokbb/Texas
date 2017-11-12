import java.util.Random;

class Player{               //玩家类,手牌底牌为牌组花色与数字的下标
    static int[] HolecardsSuit;
    String Name;
    int[] Card;
    int[] Cardnumber;
    public void setName(String name) {
        Name = name;
    }
}
class Poker{                  //定义一个牌组类
    static String[] Suit={"♠","♥","♣","♦"};
    static int[] Point={1,2,3,4,5,6,7,8,9,10,11,12,13};
    }
public class Texas {
    public static void main(String[] args) {
        //建立牌组
        String[] suit = new String[54];
        int [] point = new int[54];
        Poker array = new Poker();


        int a=0,b=0,c=0;
        Player player1 = new Player;
        Player player2 = new Player;
        player1.setName("石哥");
        player2.setName("肥涛");
        Random random = new Random();
        a = random.nextInt(54);
        b = random.nextInt(54);
        }
    }

