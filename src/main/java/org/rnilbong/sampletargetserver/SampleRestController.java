package org.rnilbong.sampletargetserver;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/v1/sample")
public class SampleRestController {

    @GetMapping()
    public List<String> getSampleString() {
        return Arrays.asList("1", "2", "3");
    }

    @GetMapping("/param")
    public String getSampleString(@RequestParam("id") String id, @RequestParam("pw") String pw) {
        System.out.println(id + "/" + pw);
        return id + "/" + pw;
    }

    @PostMapping
    public void postSampleString(@RequestBody List<String> requests) {
        System.out.println(requests);
    }
}