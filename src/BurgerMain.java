public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Making regular burger:");
        Burger regularBurger = new Burger();

        System.out.println("Making diet burger:");
        Burger dietBurger = new Burger(false);

        System.out.println("Making burger with double meat:");
        Burger doubleMeatBurger = new Burger("Double Meat");
    }
}