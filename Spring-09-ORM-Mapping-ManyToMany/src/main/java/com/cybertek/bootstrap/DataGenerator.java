package com.cybertek.bootstrap;

import com.cybertek.entity.Post;
import com.cybertek.entity.Tag;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Post post = new Post ("ORM", "ManyToMany");
        Post post1 = new Post("MVC", "Controller");

        Tag tag = new Tag ("SpringBoot");
        Tag tag1 = new Tag("JPA");

        post.getTags().add(tag);
        post.getTags().add(tag1);

        tag.getPosts().add(post);
        tag.getPosts().add(post1);

        tag.getPosts()

    }
}
