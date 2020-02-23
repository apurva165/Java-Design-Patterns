package builderpattern;

public class LunchOrderBeanProblemExample2 {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBeanProblemExample2(String bread) {
        this.bread = bread;
    }

    public LunchOrderBeanProblemExample2(String bread, String condiments) {
        this.bread = bread;
        this.condiments = condiments;
    }

    public LunchOrderBeanProblemExample2(String bread, String condiments, String dressing) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
    }

    public LunchOrderBeanProblemExample2(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
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
}
