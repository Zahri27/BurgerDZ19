public class Burger {


        private String булочка;
        private String мясо;
        private String сыр;
        private String зелень;
        private boolean майонез;

        public Burger(String булочка, String мясо, String сыр, String зелень, boolean майонез) {
            this.булочка = булочка;
            this.мясо = мясо;
            this.сыр = сыр;
            this.зелень = зелень;
            this.майонез = майонез;

            printBurgerComposition();
        }

        public Burger(String булочка, String мясо, String сыр, String зелень) {
            this(булочка, мясо, сыр, зелень, false);
        }

        public Burger(String булочка, String мясо) {
            this(булочка, мясо, "Чеддер", "Салат", true);
        }

        private void printBurgerComposition() {
            System.out.println("Состав бургера:");
            System.out.println(" - Булочка: " + булочка);
            System.out.println(" - Мясо: " + мясо);
            System.out.println(" - Сыр: " + сыр);
            System.out.println(" - Зелень: " + зелень);
            System.out.println(" - Майонез: " + (майонез ? "Да" : "Нет"));
            System.out.println();
        }

    }


