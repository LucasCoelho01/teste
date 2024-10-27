package teste.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("teste")
public class TesteController {

    @GetMapping
    public ResponseEntity<String> teste() {
        return new ResponseEntity<>("Teste Lucas", HttpStatus.OK);
    }
}
