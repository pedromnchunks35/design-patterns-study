package designPatterns.Behavioral;

public class Template {
    // ? MAIN TEMPLATE CLASS
    abstract class Beverage {
        // ? template
        public final void prepareBeverage() {
            boilWater();
            brew();
            pourInCup();
            if (customerWantsCondiments()) {
                addCondiments();
            }
        }

        protected abstract void brew();

        protected abstract void addCondiments();

        protected void boilWater() {
            System.out.println("Boiling Water");
        }

        protected void pourInCup() {
            System.out.println("Pouring in the cup");
        }

        protected boolean customerWantsCondiments() {
            return true;
        }
    }

    // Concrete Class: Tea
    public class Tea extends Beverage {
        @Override
        protected void brew() {
            System.out.println("Steeping the tea");
        }

        @Override
        protected void addCondiments() {
            System.out.println("Adding lemon");
        }
    }

    // Concrete Class: Coffee
    public class Coffee extends Beverage {
        @Override
        protected void brew() {
            System.out.println("Dripping coffee through filter");
        }

        @Override
        protected void addCondiments() {
            System.out.println("Adding sugar and milk");
        }

        @Override
        protected boolean customerWantsCondiments() {
            // Overriding hook method to customize behavior
            return false;
        }
    }
    
}
