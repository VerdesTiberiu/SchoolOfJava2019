package soj5.soj5.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import soj5.soj5.Model.Movie;

@Repository
public class MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public int add(Movie movie) {
        int id = getMaxId();
        movie.setId(id+1);
        String query ="Insert into movie values(?, ?, ?)";
        return jdbcTemplate.update(query, movie.getId(), movie.getTitle(), movie.getGenre());
    }

    private int getMaxId(){
        String query = "Select max(id) from movie";
        jdbcTemplate.queryForObject(query, Integer.class);
    }
}
