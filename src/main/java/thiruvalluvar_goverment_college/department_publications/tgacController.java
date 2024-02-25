package thiruvalluvar_goverment_college.department_publications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * tgacController
 */

// http://localhost:8080
@RestController

public class tgacController {
    @Autowired
    tgacService service;

    // http://localhost:8080/create
    @PostMapping("/create")
    public String maincreate(@RequestBody tgacEntity journaldetails) {
        return service.makeCreate(journaldetails).getAuthor() + " has been added successfully";
    }

    // http://localhost:8080/list
    @GetMapping("/list")
    public List<tgacEntity> viewAll() {
        return service.makeAll();
    }

}