public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printBurgerComposition();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this(bun, meat, cheese, greens, null);
    }

    public Burger(String bun, String meat) {
        this(bun, meat, "Чеддер", "Салат", "Майонез");
    }

    private void printBurgerComposition() {
        System.out.println("Состав бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("Мясо: " + meat);
        System.out.println("Сыр: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + (mayonnaise != null ? "Да" : "Нет"));
        System.out.println();
    }
}