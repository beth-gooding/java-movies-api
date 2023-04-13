package me.bethgooding.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Spring data mongo-db is intelligent, so it knows from the method name that we want to use the imdbId key to search
    Optional<Movie> findMovieByImdbId(String imdbId);
}
