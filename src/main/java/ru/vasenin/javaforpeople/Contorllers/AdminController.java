package ru.vasenin.javaforpeople.Contorllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vasenin.javaforpeople.Service.DataService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/source")
    public String getLine(){
        DataService dataService = new DataService();
        return dataService.getLine("Va%во~%оквеЙжa");
    }


}
