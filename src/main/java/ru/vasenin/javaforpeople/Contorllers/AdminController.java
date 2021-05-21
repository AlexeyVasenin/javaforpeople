package ru.vasenin.javaforpeople.Contorllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vasenin.javaforpeople.Service.DataService;


@RestController
@RequestMapping("/admin")
public class AdminController {

    final DataService dataService;

    @Autowired
    public AdminController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/source")
    public String getLine() {
        return dataService.getLine("Va%во~%оквеЙжa");
    }


}
