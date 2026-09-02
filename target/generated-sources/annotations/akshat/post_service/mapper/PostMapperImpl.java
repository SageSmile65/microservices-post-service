package akshat.post_service.mapper;

import akshat.post_service.dtos.PostRequest;
import akshat.post_service.dtos.PostResponse;
import akshat.post_service.model.Post;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-08-25T12:01:38+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.4 (JetBrains s.r.o.)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post toPost(PostRequest postRequest) {
        if ( postRequest == null ) {
            return null;
        }

        Post post = new Post();

        post.setTitle( postRequest.title() );
        post.setContent( postRequest.content() );

        return post;
    }

    @Override
    public PostResponse toPostResponse(Post post) {
        if ( post == null ) {
            return null;
        }

        int id = 0;
        String title = null;
        String content = null;
        int authorId = 0;

        id = post.getId();
        title = post.getTitle();
        content = post.getContent();
        authorId = post.getAuthorId();

        String authorName = null;

        PostResponse postResponse = new PostResponse( id, title, content, authorId, authorName );

        return postResponse;
    }
}
