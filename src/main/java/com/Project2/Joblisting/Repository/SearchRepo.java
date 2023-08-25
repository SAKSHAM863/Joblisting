package com.Project2.Joblisting.Repository;

import com.Project2.Joblisting.Model.Post;

import java.util.List;

public interface SearchRepo {
    List<Post> findByText(String text);

    List<Post> searchByText(String text);
}
