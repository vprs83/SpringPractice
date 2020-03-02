package springPackage.allControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // нужна имплементация, не может с простым String работать, нужны дополнительные аннотации
@RequestMapping("/super")
public class SuperController {

    //сюда нужны дополнительные аннотации
    String getMeSuperString(){
        return "Super Super";
    }
}
