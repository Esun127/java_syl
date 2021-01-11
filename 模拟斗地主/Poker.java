import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Poker {
    public static void main(String[] args) {
        //准备牌操作  
        // #### 补充代码 ###
        ArrayList<String> pokerList = new ArrayList<String>();
        ArrayList<String> shapeList = new ArrayList<String>();
        ArrayList<String> digitalList = new ArrayList<String>();


        shapeList.add("♠");
        shapeList.add("♥");
        shapeList.add("♣");
        shapeList.add("♦");
        // 组装牌
        // #### 补充代码 ###

        for (int i=2; i<=10; i++) {
            String digital = String.valueOf(i);
            digitalList.add(digital);
            
        }
        digitalList.add("J");
        digitalList.add("Q");
        digitalList.add("K");
        digitalList.add("A");
        
  


        
        for(String shape: shapeList) {
            for(String digit: digitalList){
                pokerList.add(shape + digit);
            }
        }
        pokerList.add("小王");
        pokerList.add("大王");



       
        // 洗牌
        // #### 补充代码 ###
        Collections.shuffle(pokerList);

        ArrayList[] players;
        players = new ArrayList[3];


        // 发牌
        for(int i=0; i<3; i++) {
            players[i] = new ArrayList();
        }

        for (int j=0; j<17; j++) {
            for (int i=0; i<3; i++) {

                String poker = pokerList.get(0);
                players[i].add(poker);
                pokerList.remove(poker);
            }
        }
        
        // #### 补充代码 ###
        // 看牌
        // #### 补充代码 ###
        for (int i=0; i<3; i++) {
            System.out.print("玩家" + (i+1) + ":  [");
            for (int j=0; j<17; j++){
                Object card = players[i].get(j);
                if ( card instanceof String) {
                    card = (String)card;
                    if (j != 16) {
                        System.out.print(card + ", ");
                    } else {
                        System.out.println(card + "]");
                    }
                }
            }
            
        }
        System.out.print("底牌:  [");
        for(String poker : pokerList){
            if (pokerList.indexOf(poker) == 2) {
                //System.out.println(pokerList.size());
                System.out.println(poker + "]");
            } else {
                System.out.print(poker + ", ");
            }
        }

     }
}