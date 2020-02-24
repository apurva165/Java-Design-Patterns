package factorymathodpattern;

public class WebsiteFactory {
    public static Website getWebsite(String siteType) {
        if ("blog".equals(siteType)) {
            return new Blogsite();
        } else if ("shop".equals(siteType)) {
            return new Shopsite();
        } else {
            return null;
        }
    }
}
