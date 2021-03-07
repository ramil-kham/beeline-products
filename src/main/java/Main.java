public class Main {
    public static void main(String[] args) {

        BeelineProduct closePeople1 = new BeelineProduct();
        BeelineProduct closePeople2 = new BeelineProduct();

        closePeople1.gb = 15;
        closePeople1.minutes = 400;
        closePeople1.sms = 300;
        closePeople1.pricePerMonth = 350;
        closePeople1.eSimSupport = "Поддерживает eSim";
        closePeople1.title = "Близкие люди 1";
        closePeople1.learnMore = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi/";

        closePeople2.gb = 30;
        closePeople2.minutes = 600;
        closePeople2.sms = 300;
        closePeople2.pricePerMonth = 320;
        closePeople2.oldPricePerMonth = 400;
        closePeople2.discount = 20;
        closePeople2.eSimSupport = "Поддерживает eSim";
        closePeople2.title = "Близкие люди 2";
        closePeople2.learnMore = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi-2/";

        System.out.println(closePeople1.gb);
    }
}
