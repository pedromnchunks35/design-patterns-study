package designPatterns.Structural;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    interface Graphic {
        void draw();
    }

    class Circle implements Graphic {
        @Override
        public void draw() {
            System.out.println("draw a circle");
        }
    }

    class Square implements Graphic {
        @Override
        public void draw() {
            System.out.println("draw a square");
        }
    }

    class Composed implements Graphic {
        private List<Graphic> childGraphs = new ArrayList<Graphic>();

        public void add(Graphic graph) {
            childGraphs.add(graph);
        }

        public void remove(Graphic graphic) {
            childGraphs.remove(graphic);
        }

        @Override
        public void draw() {
            for (Graphic graph : childGraphs) {
                graph.draw();
            }
        }
    }
}
