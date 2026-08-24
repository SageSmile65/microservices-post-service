package akshat.post_service.controller;

import akshat.post_service.dtos.PostRequest;
import akshat.post_service.dtos.PostResponse;
import akshat.post_service.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/{id}")
    public void createPost(@PathVariable("id") int authorId,@RequestBody PostRequest postRequest){
        postService.createPost(postRequest,authorId);
    }

    @GetMapping("/{id}")
    public PostResponse getPost(@PathVariable("id") int postId){
        return postService.getPostById(postId);
    }
}
