import java.util.ArrayList;

public class Cards {
    private int num; // 1 -> 13 (No jokers)
    private String suit; // diamond, heart, club, spade

    public Cards(int num, String suit){
        this.num = num;
        this.suit = suit;
    }

    public static ArrayList<Cards> shuffle(ArrayList<Cards> deck){
        ArrayList<Cards> tempDeck = new ArrayList<>(deck.size());

        for(int i = 0; i < deck.size(); i++){
            tempDeck.add(null);
        }

        int count = 0;
        while(count < deck.size()){
            int ranPos = (int)(Math.random() * deck.size());
            if(tempDeck.get(ranPos) == null){
                tempDeck.set(ranPos, deck.get(count));
                count++;
            }
        }

        return tempDeck;
    }

    public static int getScore(Cards c1, Cards c2, ArrayList<Cards> table){
        int score = 0;
        ArrayList<Cards> allCards = new ArrayList<Cards>();
        boolean sameSuit = false;
        allCards.add(c1);
        allCards.add(c2);
        for(int i = 0; i < 5; i++){
                allCards.add(table.get(i));
        }

        //sort:
        

        for(int i = 0; i < allCards.size()-1; i++){
            if(allCards.get(i).getSuit().equals(allCards.get(i+1).getSuit())){
                sameSuit = true;
            }
            else{
                sameSuit = false;
            }
        }



        return score;
    }

    public int getNum(){ return num; }
    public String getSuit(){ return suit; }
    

//getHand each is an arraylist for 5 bots, 1 player (each 2 cards)
//fold, call, raise, all in
//each bot does same
//then after this house will show 3 cards flop
//if everyone checks, house will show 1 card turn
//if everyone checks, house will show 1 card river

//then again player can raise of fold and bots will based on threshold score
//then people will either check or 

}
