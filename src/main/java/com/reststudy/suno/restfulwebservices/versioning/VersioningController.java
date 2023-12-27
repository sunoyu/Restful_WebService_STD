package com.reststudy.suno.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersion() {
        return new PersonV1("Roy Yoo");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersion() {
        return new PersonV2(new Name("Roy", "Yoo"));
    }
}
