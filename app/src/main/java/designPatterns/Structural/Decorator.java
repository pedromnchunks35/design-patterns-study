package designPatterns.Structural;

public class Decorator {
    // Component: Coffee
    public interface Coffee {
        double cost();

        String getDescription();
    }

    // Concrete Component: Espresso
    public class Espresso implements Coffee {
        @Override
        public double cost() {
            return 1.99;
        }

        @Override
        public String getDescription() {
            return "Espresso";
        }
    }

    // Decorator: CoffeeDecorator
    public abstract class CoffeeDecorator implements Coffee {
        protected Coffee decoratedCoffee;

        public CoffeeDecorator(Coffee decoratedCoffee) {
            this.decoratedCoffee = decoratedCoffee;
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost();
        }

        @Override
        public String getDescription() {
            return decoratedCoffee.getDescription();
        }
    }

    // Concrete Decorator: MilkDecorator
    public class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        @Override
        public double cost() {
            return super.cost() + 0.50; // Adding cost of milk
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", Milk";
        }
    }

    // Concrete Decorator: SugarDecorator
    public class SugarDecorator extends CoffeeDecorator {
        public SugarDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        @Override
        public double cost() {
            return super.cost() + 0.25; // Adding cost of sugar
        }

        @Override
        public String getDescription() {
            return super.getDescription() + ", Sugar";
        }
    }
    //? AS WE CAN SEE AS WE MOVE FORWARD WE ARE ALWAYS RECURSEVELY USING WHAT ALREADY COMES FROM THE PAST OBJECT ADDING ALWAYS SOMETHING BECAUSE IT DOES SUPER.(METHOD)
}
