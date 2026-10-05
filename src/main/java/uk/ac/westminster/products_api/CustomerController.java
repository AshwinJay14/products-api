package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping ("/customers")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getById(@PathVariable long id) {
        Address address = new Address("115 New Canvedish Street", "London", "W1W 6UW");

        return new Customer(id, "Ada Lovelace", address, "ada@example.com");
    }


}


