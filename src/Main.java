
public class Main {
    public static void main(String[] args) {

        int amount; // сумма счета
        int refill;  // сумма пополнения
        amount = 500;
        refill = 230;
        int bonus; // бонусы
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int score;
        score = amount + refill + bonus; //сумма после пополнения счета c начислением бонусов
        System.out.println("Бонус за пополнение: " + bonus);
        System.out.println("Баланс: " + score);
    }
}