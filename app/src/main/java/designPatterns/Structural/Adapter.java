package designPatterns.Structural;

public class Adapter {
    interface Target {
        void request();
    }

    // ? The component that will be adapted
    class Adaptee {
        public void specificRequest() {
            System.out.println("Something specific");
        }
    }
    //? The adapter
    class TheActuallAdapter implements Target {
        private Adaptee adptee;

        public TheActuallAdapter(Adaptee adaptee) {
            this.adptee = adaptee;
        }
        //? We are making this request using in the adapter using the class that we intended to adapt
        @Override
        public void request() {
            adptee.specificRequest();
        }
    }
}
