
public class Main {
    public static void main(String[] args) {

        int amount; // сумма счета
        int refill;  // сумма пополнения
        amount =5000;
        refill = 2300;
        int bonus; // бонусы
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус за пополнение: " + bonus);
    }
}