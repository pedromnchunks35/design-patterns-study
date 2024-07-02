package designPatterns.Creational;

public class Builder {
    public class House {
        private String foundation;
        private String structure;
        private String roof;
        private String interior;

        private House(HouseBuilder builder) {
            this.foundation = builder.foundation;
            this.structure = builder.structure;
            this.roof = builder.root;
            this.interior = builder.interior;
        }

        public static class HouseBuilder {
            private String foundation;
            private String structure;
            private String root;
            private String interior;

            public HouseBuilder buildFoundation(String foundation) {
                this.foundation = foundation;
                return this;
            }

            public HouseBuilder buildStructure(String structure) {
                this.structure = structure;
                return this;
            }

            public HouseBuilder buildRoof(String roof) {
                this.root = roof;
                return this;
            }

            public HouseBuilder buildInterior(String interior) {
                this.interior = interior;
                return this;
            }

            /**
             * @return
             */
            public House build() {
                return null;
            }
        }
    }
}
