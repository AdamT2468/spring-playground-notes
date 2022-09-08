package com.example.demo.math;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetVolumeController {
    @RequestMapping("/math/volume/{length}/{width}/{height}")

    public String getVolume(
            @PathVariable int length,
            @PathVariable int width,
            @PathVariable int height
    ){


        return String.format("The volume of a %dx%dx%d rectangle is %d", length, width, height, (length*width*height));


    }
}
