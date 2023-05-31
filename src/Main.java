
public class Main {
    public static void main(String[] args) {

        int amount = 5000; // сумма счета
        int refill = 2300;  // сумма пополнения
        int bonus; // бонусы
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус за пополнение: " + bonus);
    }
}