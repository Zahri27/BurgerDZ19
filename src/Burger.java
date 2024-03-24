public class Burger {
 private String bun;
 private String meat;
 private String cheese;
 private String greens;
 private boolean mayo;

    public Burger() {
        this.bun = "Bun";
        this.meat = "Meat";
        this.cheese = "Cheese";
        this.greens = "Greens";
        this.mayo = true;
        printComposition();
    }

    public Burger(boolean mayo) {
        this.bun = "Bun";
        this.meat = "Meat";
        this.cheese = "Cheese";
        this.greens = "Greens";
        this.mayo = mayo;
        printComposition();
    }

    public Burger(String extraMeat){
        this.bun = "Bun";
        this.meat = "Double Meat";
        this.cheese = "Cheese";
this.greens = "Greens";
this.mayo = true;
printComposition();
    }

        private void printComposition() {
        System.out.println("Burger composition:");
System.out.println("Bun: " + bun);
System.out.println("Meat: " + meat);
System.out.println("Cheese: " + cheese);
        System.out.println("Greens: " + greens);
 System.out.println();
    }
}