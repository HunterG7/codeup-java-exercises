package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static Input input = new Input();
    public static void main(String[] args) {
        System.out.println("Do you want to see the movie options? [y/N]");
        if (input.yesNo()){
            Movie[] allMovies = MoviesArray.findAll();
            movieOptions(allMovies);
        }
    }

    // prompts user with different movie options
    public static void movieOptions(Movie[] allMovies){
        System.out.print("""
                What would you like to do?
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the sci-fi category
                6 - add a movie
                
                Enter Your Choice:
                """);
        int userChoice = input.getInt();

        choice(allMovies, userChoice);
    }

    // this function directs code to the correct function depending on what movie option is picked
    private static void choice(Movie[] allMovies, int userChoice) {
        switch (userChoice) {
            case 0 -> System.out.println("Thank you!");
            case 1 -> allMovies(allMovies);
            case 2 -> printMoviesByCategory(allMovies, "animated");
            case 3 -> printMoviesByCategory(allMovies, "drama");
            case 4 -> printMoviesByCategory(allMovies, "horror");
            case 5 -> printMoviesByCategory(allMovies, "scifi");
            case 6 -> addMovie(allMovies);
            default -> {
                System.out.println("That is no a valid choice.");
                movieOptions(allMovies);
            }
        }
    }

    // displays movies based on category of movie picked
    public static void printMoviesByCategory(Movie[] allMovies, String category) {
        System.out.println("Here are all the " + category + " movies:");
        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName());
            }
        }
        System.out.println("------------------------");
        movieOptions(allMovies);
    }

    // displays all movies
    public static void allMovies(Movie[] allMovies){
        System.out.println("Here are all the movies:");
        for (Movie movie : allMovies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
        System.out.println("------------------------");
        movieOptions(allMovies);
    }

    // allows user to add a movie to MoviesArray
    public static void addMovie(Movie[] allMovies){
        System.out.println("Please enter the movie's name:");
        String newMovieName = input.getString();
        System.out.println("Please enter the movie's category:");
        String newMovieCategory = input.getString();

        Movie[] updatedMovies = Arrays.copyOf(allMovies, allMovies.length + 1);
        Movie newMovie = new Movie(newMovieName, newMovieCategory);
        updatedMovies[allMovies.length] = newMovie;

        allMovies = updatedMovies;
        movieOptions(allMovies);
    }

}
