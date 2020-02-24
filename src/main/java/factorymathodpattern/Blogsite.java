package factorymathodpattern;

public class Blogsite extends Website {

    // creating factory
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
