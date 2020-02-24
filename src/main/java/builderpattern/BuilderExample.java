package builderpattern;

public class BuilderExample {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;


    public BuilderExample(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    // inner class
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;


        public BuilderExample build() {
            return new BuilderExample(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this; // returns the Builder object
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this; // returns the Builder object
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this; // returns the Builder object
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this; // returns the Builder object
        }

    }
}
