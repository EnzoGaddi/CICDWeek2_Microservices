package ie.atu.week2;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
//test
    @GetMapping("/greet/{name}")
    public String greetByNmae(@PathVariable String name)
    {
        return "Hello" + name + "!";
    }
}
