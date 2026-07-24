package project.lybrary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.lybrary.domain.common.tool.idgenerator.contract.IdGenerator;

@RestController
@RequestMapping("/orders")

public class TestController {

    public IdGenerator generator;

    public TestController(IdGenerator generate) {
        this.generator = generate;
    }

    @GetMapping("/ping")
    public String ping() {
        return this.generator.generate();
    }
    
}
