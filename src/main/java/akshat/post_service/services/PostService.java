package akshat.post_service.services;

import akshat.post_service.dtos.PostRequest;
import akshat.post_service.dtos.PostResponse;
import akshat.post_service.dtos.UserDto;
import akshat.post_service.httpInterface.UserClient;
import akshat.post_service.mapper.PostMapper;
import akshat.post_service.model.Post;
import akshat.post_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    //importing userClient bean
    private final UserClient userClient;

    public void createPost(PostRequest postRequest,int authorId){
        Post post = postMapper.toPost(postRequest);
        post.setAuthorId(authorId);
        postRepository.save(post);
    }

    public PostResponse getPostById(int postId){
        Post post = postRepository.findById(postId).orElseThrow(()-> new RuntimeException("Post not found"));

        UserDto userDto = userClient.getUserById(post.getAuthorId());

        return new PostResponse(post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getAuthorId(),
                userDto.name());
    }
}
