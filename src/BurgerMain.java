public class BurgerMain {

    public static void main(String[] args) {
        Burger regularBurger = new Burger("Пшеничная", "Говядина");
        Burger dietBurger = new Burger("Цельнозерновая", "Курица", "Моцарелла", "Шпинат");
        Burger doubleMeatBurger = new Burger("Бриош", "2x Говядина", "Гауда", "Руккола", "Барбекю");
    }
}