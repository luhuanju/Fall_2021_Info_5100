package finalExam.problem4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        // task 1
        // Add List of movies based on the classes created above.
        Netflix netflix=new Netflix();
        Genre g1=new Genre();
        g1.movieList.add(new Movie("t1 in Genre1",new GregorianCalendar(1995, Calendar.FEBRUARY, 11),Arrays.asList("actor1","actor2"),"director1"));
        g1.movieList.add(new Movie("t2 in Genre1",new GregorianCalendar(2000, Calendar.OCTOBER, 12),Arrays.asList("actor3","actor4"),"director2"));
        g1.movieList.add(new Movie("t3 in Genre1",new GregorianCalendar(1998, Calendar.DECEMBER, 5),Arrays.asList("actor1","actor4"),"director3"));
        netflix.getGenreList().add(g1);

        Genre g2=new Genre();
        g2.movieList.add(new Movie("t1 in Genre2",new GregorianCalendar(2003, Calendar.JULY, 4),Arrays.asList("actor1","actor2"),"director1"));
        g2.movieList.add(new Movie("t2 in Genre2",new GregorianCalendar(1997, Calendar.AUGUST, 13),Arrays.asList("actor3","actor4"),"director2"));
        g2.movieList.add(new Movie("t3 in Genre2",new GregorianCalendar(1993, Calendar.NOVEMBER, 23),Arrays.asList("actor1","actor4"),"director3"));
        netflix.getGenreList().add(g2);

        // task 2
        // or all movies released before 2000, add the string "(Classic)" to the title
        System.out.println("------output the movie which release years is before 2000 and add Classic in its title-------");
        netflix.getGenreList().stream()
                .flatMap(a -> a.movieList.stream())
                .filter(c ->c.releaseYear.get(Calendar.YEAR)<2000 )
                .forEach(d->{
                    d.setTitle( "Classic " + d.getTitle());
                    System.out.println(d.getTitle());
                });


        System.out.println("------output the latest 3 movies---------");
        // task 3
        // Get the latest 3 movies released using .limit() method of stream
        List<Movie> list=netflix.getGenreList().stream()
                .flatMap(a -> a.movieList.stream())
                .collect(Collectors.toList());
        Collections.sort(list,(a,b)->b.releaseYear.get(Calendar.YEAR)-a.releaseYear.get(Calendar.YEAR));
        list.stream().limit(3).forEach(movie -> {System.out.println(movie.getTitle()+" "+movie.getReleaseYear().get(Calendar.YEAR));});

        // task4
        // create a predicate for release date before 2000
        // a predicate for release date before 1990
        // Chain the predicates for finding movies between 1990 and 2000.
        System.out.println("------chain the predicates for finding movies between 1990 and 2000.--------");
//        List<Movie> task4=netflix.getGenreList().stream()
//                .flatMap(a -> a.movieList.stream())
//                .filter(isAdultMale(a) )
////                .filter(c -> c.releaseYear.get(Calendar.YEAR)>1990  )
//                .collect(Collectors.toList());
//        task4.stream().forEach(movie -> {System.out.println(movie.getTitle()+" "+movie.getReleaseYear().get(Calendar.YEAR));});
//
//        netflix.getGenreList().stream()
//                .flatMap(a -> a.movieList.stream())
//                .filter(  )
//                .collect(Collectors.<Movie>toList());

        g1.movieList.addAll(g2.movieList);
        List<Movie> task4= filterMovies(g1.movieList, predicate());
        task4.stream().forEach(movie -> {System.out.println(movie.getTitle()+" "+movie.getReleaseYear().get(Calendar.YEAR));});



        // task 5
        // add release year in the title of the movie
        System.out.println("------add release year in the title of the movie---------");
        netflix.getGenreList().stream().flatMap(a -> a.movieList.stream()).forEach( e->{
            e.setTitle(e.releaseYear.get(Calendar.YEAR)+" "+e.getTitle());
            System.out.println(e.getTitle());
        });

        System.out.println("------sort all move by its name ---------");
        // task 6
        // Sorting on one of the feature
        // sort by title
        for (Genre g: netflix.genreList){
            Collections.sort(g.movieList,(a,b)->a.getTitle().compareTo(b.getTitle()));
        }
        for (Genre g: netflix.genreList){
            g.movieList.stream().forEach(e->{System.out.println(e.getTitle());});
        }



    }
    public static Predicate<Movie> predicate()
    {
        return p -> p.releaseYear.get(Calendar.YEAR) <2000  &&p.releaseYear.get(Calendar.YEAR) >1990 ;
    }
    public static List<Movie> filterMovies (List<Movie> movies, Predicate<Movie> predicate) {
        return movies.stream()
                .filter(predicate)
                .collect(Collectors.<Movie>toList());
    }
}
