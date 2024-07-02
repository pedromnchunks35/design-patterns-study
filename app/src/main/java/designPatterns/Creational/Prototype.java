package designPatterns.Creational;

import java.util.HashMap;
import java.util.Map;

public class Prototype {
    interface Proto {
        Proto clone();
    }

    class Something implements Proto {
        private String state;

        public Something(String state) {
            this.state = state;
        }

        @Override
        public Something clone() {
            return new Something(state);
        }
    }

    class PrototypeRegistry {
        private Map<String, Proto> prototypes = new HashMap<>();

        public void registerPrototype(String key, Proto prototype) {
            prototypes.put(key, prototype);
        }

        public Proto createPrototype(String key) {
            Proto prototype = prototypes.get(key);
            return prototype != null ? prototype.clone() : null;
        }
    }
    // ? Now the client creates a new object using this registry of prototypes
}
