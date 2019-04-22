package soj5.soj5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import soj5.soj5.Service.MovieService;

//@Controller
//@ResponseBody

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService; // injecteaza prin intermdiul autowired automat
    //CRUD
    //create
    /*
    * Sunt 3 optiuni :
    *   1) RequestBody
    *   2) RequestParam
    *   3) PathVariable
    * */

    // @RequestMapping(method = RequestMethod.POST) // pot sa declar asa tipul de verb http sau PostMapping
    @PostMapping(value = "/");
    public int add(@RequestParam String title, @RequestParam String genre){
        return movieService.add(title,genre);

    }
    //retrive

    //update

    //delete


}
