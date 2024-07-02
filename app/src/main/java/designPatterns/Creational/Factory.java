package designPatterns.Creational;

public class Factory {
    interface Product {
        void operation();
    }
    //? Every product has its own operation
    class Chair implements Product{
        public void operation(){
            System.out.println("Sit");
        }
    }
    class Bike implements Product{
        public void operation(){
            System.out.println("Ride");
        }
    }
    abstract class Creator{
        //? A method that gets the product
        public abstract Product someProd();
        //? A trigger that gets the product and then uses its operation
        public void trigger(){
            Product product = someProd();
            product.operation();
        }
    }
    class creator extends Creator{
        //? This creator produces bikes for example
        public Product factoryMethod(){
            return new Bike();
        }

        @Override
        public Product someProd() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'someProd'");
        }
    }
}
