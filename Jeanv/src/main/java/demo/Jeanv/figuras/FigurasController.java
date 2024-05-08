package demo.Jeanv.figuras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/figuras")

public class FigurasController {
    @Autowired
    private FigurasService figurasService;

    @PostMapping("/")
    public Figuras save(@RequestBody Figuras entity){
        return figurasService.save(entity);
    }

    @GetMapping("/{id}")
    public Figuras findById(@PathVariable long id){
        return figurasService.findById(id);
    }

    @PutMapping("/")
    public Figuras update(@RequestBody Figuras entity){
        return figurasService.save(entity);
    }
}
