package springPackage.allControllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home2")
public class SideController {

    @GetMapping("/hell")
    String getMeAnotherString(){
        return "Bye Hell";
    }

    // http://localhost:8080/home2/param?name=Alexander

    // без required = false URL: http://localhost:8080/home2/param - выдаст ошибку
    @GetMapping("/param")
    String returnMeParametr(@RequestParam(value = "name", required = false, defaultValue = "World") String input){
        return "Hello " + input;
    }

    @GetMapping("/{path}")  // @PathVariable -> /{path}
    String returnMePass(@PathVariable String path){     // @PassVariable исключает дубликаты
        return "Hello " + path;
    }

}
