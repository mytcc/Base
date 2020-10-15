package module;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "hello ruoli";
    }

    @RequestMapping("/{name}")
    public String index(@PathVariable("name") String name){
        return "hello "+name;
    }
}
