public class HouseBuilder {

    String address;
    String name;
    String foundationType;

    public HouseBuilder(Builder builder) {
        this.address = builder.address;
        this.name = builder.name;
        this.foundationType = builder.foundationType;
    }

    public static class Builder {

        String address;
        String name;
        String foundationType;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFoundationType(String foundationType) {
            this.foundationType = foundationType;
            return this;
        }

        public HouseBuilder build() {
            return new HouseBuilder(this);
        }
    }
}


