
package designPatterns.Creational;

public class Abstraction {
    // ? We should abstract product interfaces
    interface Chain {
        void sitOn();
    }

    interface Sofa {
        void lieOn();
    }

    class VictorianChair implements Chain {
        public void sitOn() {
            System.out.println("Sitting on the victorian chair");
        }
    }

    class VictorianSofa implements Sofa {
        public void lieOn() {
            System.out.println("Lying on a Victorian Sofa");
        }
    }

    class ModernChair implements Chain {
        public void sitOn() {
            System.out.println("Sitting on a Modern chair");
        }
    }

    class ModernSofa implements Sofa {
        public void sitOn() {
            System.out.println("Sitting on a Modern Sofa");
        }

        @Override
        public void lieOn() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'lieOn'");
        }
    }

    interface FurnitureFactory {
        Chain createChair();

        Sofa createSofa();
    }

    class VictorianFurnitureFactory implements FurnitureFactory {
        public Chain createChair() {
            return new VictorianChair();
        }

        public Sofa createSofa() {
            return new VictorianSofa();
        }
    }
}
