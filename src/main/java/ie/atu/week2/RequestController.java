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
    public String greetByName(@PathVariable String name)
    {
        return "Hello" + name + "!";
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Name: " + name + ", Age: " + age;
    }

    @GetMapping("/person")
    public Person getPerson()
    {
        return new Person("Enzo", 19);
    }

    @GetMapping("/Calculator")
    public Calculator calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operate)
    {
        double sum;

        switch (operate)
        {
            case "add":
                sum = num1 + num2;
                break;

            case "sub":
                sum = num1 - num2;
                break;

            case "mul":
                sum = num1 * num2;
                break;

            case "divide":
                sum = num1 / num2;
                break;

            default:
                sum = 0;
                break;
        }
        return new Calculator(operate, sum);
    }
}
