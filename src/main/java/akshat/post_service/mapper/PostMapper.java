package akshat.post_service.mapper;

import akshat.post_service.dtos.PostRequest;
import akshat.post_service.dtos.PostResponse;
import akshat.post_service.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PostMapper {

    Post toPost(PostRequest postRequest);
    PostResponse toPostResponse(Post post);
}
