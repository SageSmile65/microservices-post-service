package akshat.post_service.dtos;

public record PostResponse(int id,String title, String content,int authorId,String authorName) {
}
