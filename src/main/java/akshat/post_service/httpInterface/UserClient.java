package akshat.post_service.httpInterface;

import akshat.post_service.dtos.UserDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/users")
public interface UserClient {

    @GetExchange("/{id}")
    UserDto getUserById(@PathVariable("id") int id);
}
