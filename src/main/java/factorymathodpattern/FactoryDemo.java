package factorymathodpattern;

public class FactoryDemo {
    public static void main(String[] args) {

        Website factory = WebsiteFactory.getWebsite("blog");

        System.out.println(factory.getPages());

        Website factory2 = WebsiteFactory.getWebsite("shop");

        System.out.println(factory2.getPages());

    }
}
