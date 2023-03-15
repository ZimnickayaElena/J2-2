public class Main {
    public static void main(String[] args) {

        int begining = 100;
        int cash = 1500;

        if (cash > 1000) {
            int bonus = cash / 100;
            System.out.println("На вашем счете " + (begining + cash) + " рублей и " + bonus + " бонусов");
        } else {
            System.out.println("На вашем счете " + (begining + cash) + " рублей");
        }

    }
}