public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 1100;
        int bonus = 0;

        if (payment > 1000) {
            bonus = payment / 100;
        }

        int end = account + payment + bonus;

        System.out.println("После произведения оплаты в " + payment + " рублей, на счету " + end + " рублей.");

    }
}
