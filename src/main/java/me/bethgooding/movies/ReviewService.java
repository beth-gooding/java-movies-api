package me.bethgooding.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    // Templates allow you to talk to the database and do things that are too complex for repositories
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody)); // Calling insert also returns the data you just pushed into the db

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))// Update the matching movie
                .apply(new Update().push("reviewIds").value(review))// Now apply the update to the reviewIds
                .first(); // This makes sure this line of code is run before moving on

        return review;
    }
}
