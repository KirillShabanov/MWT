package com.home.MyWorkTime.controller;

import com.home.MyWorkTime.service.SelectForTOService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/to_regulations")
@AllArgsConstructor
@Log
@CrossOrigin
public class SelectForTOController {

    private final SelectForTOService selectForTOService;

    @GetMapping("/forTO/{IdTO}")
    public Long TOIdForSelect(@PathVariable Long IdTO){
        log.info("Handling find ID TO: " + IdTO);
        return null;
    }

    @GetMapping("/forAuto/{IdAuto}")
    public Long AutoIdForSelect(@PathVariable Long IdAuto){
        log.info("Handling find ID Auto: " + IdAuto);
        return null;
    }

}
