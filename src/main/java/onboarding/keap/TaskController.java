package onboarding.keap;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpResponseWrapper;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.simple.SimpleHttpResponseFactory;
import java.util.Arrays;
import java.util.List;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/task")
public class TaskController {

  @Get
  public List<Task> getTasks() {
    return Arrays.asList(new Task("uncompleted task 1"), new Task("uncompleted task 2"));
  }

  @Post
  public HttpResponse<String> task(@Body Task task) {
    return new SimpleHttpResponseFactory().ok();
  }
}

