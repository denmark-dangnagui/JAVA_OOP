package test1;

public class CardCompanyTest {

    public static void main(String[] args) {
        CardCompany a = CardCompany.getInstance();
        CardCompany company = CardCompany.getInstance();

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println("myCard.getCardNum() = " + myCard.getCardNum());
        System.out.println("yourCard.getCardNum() = " + yourCard.getCardNum());

    }
}
