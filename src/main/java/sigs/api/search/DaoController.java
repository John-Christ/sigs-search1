package sigs.api.search;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sigs.api.dao.DAOUser;
import sigs.api.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/doa")
public class DaoController {

    private UserService userService;

    public DaoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<DAOUser>> searchUsers(@RequestParam("query") String query){
        return ResponseEntity.ok(userService.searchUsers(query));
    }

  /*  @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }*/
}