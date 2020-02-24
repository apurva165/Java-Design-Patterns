package prototypepattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("movie1");
        movie.setRunTime("2.22");
        movie.setPrice(2.33);
        items.put("Movie", movie);


        Book book = new Book();
        book.setNumberOfPages(23);
        book.setPrice(3.3);
        book.setTitle("book1");
        items.put("book", book);
    }
}
