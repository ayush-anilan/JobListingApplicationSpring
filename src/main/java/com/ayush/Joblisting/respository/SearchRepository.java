package com.ayush.Joblisting.respository;

import com.ayush.Joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
