package soj5.soj5.Service;

import org.springframework.stereotype.Service;
import soj5.soj5.Model.Movie;
import soj5.soj5.Repository.MovieRepository;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public int add(String title, String genre) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        return movieRepository.add(movie);
    }
}
