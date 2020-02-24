package builderpattern;

public class BuilderDemo {
    public static void main(String[] args) {
        //  BuilderExample.Builder order = new BuilderExample.Builder();

        BuilderExample.Builder order = new BuilderExample.Builder();
        order.bread("sd").dressing("sd");

        BuilderExample builderExample = order.build();

        System.out.println(builderExample.getBread());
        System.out.println(builderExample.getCondiments());
        System.out.println(builderExample.getDressing());

    }
}
