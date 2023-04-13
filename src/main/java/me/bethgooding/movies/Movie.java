package me.bethgooding.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies") // This class represents each document in the movies collection
// The use of Lombok plugins removes boilerplate code
@Data // Comes from Lombok and takes care of all of the getters/setters/string methods etc
@AllArgsConstructor // Creates a constructor that takes all the private fields as arguments
@NoArgsConstructor // Creates a constructor that takes no arguments
public class Movie {
    @Id // Annotates that this property should be treated as the unique identifier in the db
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
}
