package designPatterns.Behavioral;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    interface Subject {
        void register(ActualObserver observer);

        void unregister(ActualObserver observer);

        void notifyObservers();
    }

    interface ActualObserver {
        void update(String symbol, double price);
    }

    // ? A product that wants to be observed
    class Stock implements Subject {
        private String symbol;
        private double price;
        private List<ActualObserver> observers = new ArrayList<>();

        @Override
        public void register(ActualObserver observer) {
            observers.add(observer);
        }

        @Override
        public void unregister(ActualObserver observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (ActualObserver observer : observers) {
                observer.update(symbol, price);
            }
        }

    }

    // ? An investor that observates it
    public class Investor implements ActualObserver {
        private String name;

        public Investor(String name) {
            this.name = name;
        }

        @Override
        public void update(String symbol, double price) {
            System.out.println(name + " got notified: Price of " + symbol + " is now " + price);
        }
    }

    //? A investor register into a stock and receives a update call every time theres a update in the stock

}
