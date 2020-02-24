package prototypepattern;

public class Demo {
    public static void main(String[] args) {
        // we were able to get new instance of object without using new keyword,
        //we also override some values like title without being creating new instance.
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Conditional Patterns in java");
        System.out.println(movie);
        System.out.println(movie.getRunTime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());


        Movie anotherMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("Gang of four");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRunTime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

    }
}
