package com.kodbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodbook.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
