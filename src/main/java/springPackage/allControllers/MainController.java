package springPackage.allControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"/", "/home"})
public class MainController {

    @Value("${some.value.one}") // вытаскиваем из application.properties
    String valueNoOne;          // или из application.yml

    @Value("${some.value.another}")
    String valueNoTwo;

    @GetMapping("value")
    String returnMeValue(){
        return valueNoOne;
    }
//    @GetMapping("value")
//    String returnMeValue(){
//        return valueNoTwo;
//    }

    @GetMapping("/string")
    String getSimpleString(){
        return "Hello World";
    }
    @GetMapping("/List")
    List<String> getSimpleList() { // List<String> - ип возвращаемого функцией значения
        List<String> stringList = new ArrayList<>(); // тут создаем переменную (которую будем возвращать)
        stringList.add("John");
        stringList.add("Bob");
        stringList.add("Igor");
        return stringList;
    }
    @GetMapping("/Map")
    Map<Integer, String> getSimpleMap(){ // в map не может быть одинаковых ключей
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bob");
        map.put(2, "George");
        return map;
    }
}
