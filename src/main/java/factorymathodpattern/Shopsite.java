package factorymathodpattern;

public class Shopsite extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
