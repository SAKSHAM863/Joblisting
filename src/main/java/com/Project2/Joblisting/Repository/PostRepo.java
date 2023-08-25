package com.Project2.Joblisting.Repository;

import com.Project2.Joblisting.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepo extends MongoRepository<Post,String> {

}
