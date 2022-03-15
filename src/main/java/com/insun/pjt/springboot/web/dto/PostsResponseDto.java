package com.insun.pjt.springboot.web.dto;

import com.insun.pjt.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = getId();
        this.title = getTitle();
        this.content = getContent();
        this.author = getAuthor();
    }
}
