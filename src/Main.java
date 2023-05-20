
public class Main {
    public static void main(String[] args) {

        int amount; // сумма счета
        int y;  // сумма пополнения
        amount = 500;
        y = 230;
        int bonus; // бонусы
        if(y >=1000) {
            bonus=y/100;
        }
        else {
            bonus = 0;
        }
        int x;
        x = amount + y + bonus; //сумма после пополнения счета c начислением бонусов
        System.out.println("Бонус за пополнение: " + bonus);
        System.out.println("Баланс: " + x);
    }
    }