package test1;

public class CardCompany {

    private static CardCompany instance = new CardCompany();

    static int cardNum = 10000;
    private CardCompany(){}

    public static CardCompany getInstance() {
        return instance;
    }

    public Card createCard(){
        Card card = new Card();
        cardNum++;
        card.setCardNum(cardNum);
        return card;
    }
}
