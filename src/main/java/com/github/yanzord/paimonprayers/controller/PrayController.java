package com.github.yanzord.paimonprayers.controller;

import com.github.yanzord.paimonprayers.model.Reward;
import com.github.yanzord.paimonprayers.service.PrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PrayController {

    @Autowired
    private PrayService prayService;

    @PostMapping("/rewards")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Reward> create(@RequestBody Reward reward) {
        return prayService.save(reward);
    }

    @GetMapping(path = "/rewards", produces = "application/stream+json")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Reward> findAll() {
        return prayService.findAll();
    }

    @GetMapping(path = "/pray")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Reward> pray(@RequestParam String quantity) {
        return prayService.pray(quantity);
    }
}
