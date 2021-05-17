public class Main {
    // если клиент пополняет счёт более чем на 1000 рублей,
    // то сотовый оператор дарит ему по 1 рублю за каждые 100 рублей.
    public static void main(String[] args) {
        int BONUS_CONDITION = 1000;
        int BONUS_STEP = 100;

        int account = 100;
        int addition = 1100;

        int bonus = 0;

        if (addition > BONUS_CONDITION) {
            bonus = addition / BONUS_STEP;
        }

        account += addition + bonus;
        System.out.println("account:" + account);
        System.out.println("bonus:" + bonus);
    }
}
