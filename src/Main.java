public class Main {
    public static void main(String[] args) {

        int begining = 100;
        int cash = 1300;
        int bonus = cash / 100;

        if (cash >= 1000) {
            System.out.println("Вам начислено " + bonus + " баллов");
            System.out.println("На вашем счете " + (begining + cash) + " рублей");
        } else {
            System.out.println("Вам начислено " + 0 + " баллов");
            System.out.println("На вашем счете " + (begining + cash) + " рублей");
        }

    }
}