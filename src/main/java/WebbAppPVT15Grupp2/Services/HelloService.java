package WebbAppPVT15Grupp2.Services;

import WebbAppPVT15Grupp2.Models.Hello;
import WebbAppPVT15Grupp2.Repositories.HelloRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api")
public class HelloService {
    @Autowired
    HelloRespository respository;



    @GetMapping("/hello")
    public Iterable<Hello> findAllHellos() {
        return respository.findAll();
    }



}





