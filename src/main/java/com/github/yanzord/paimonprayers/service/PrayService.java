package com.github.yanzord.paimonprayers.service;

import com.github.yanzord.paimonprayers.model.Reward;
import com.github.yanzord.paimonprayers.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PrayService {

    @Autowired
    private RewardRepository rewardRepository;

    public Mono<Reward> save(Reward reward) {
        return rewardRepository.save(reward);
    }

    public Flux<Reward> findAll() {
        return rewardRepository.findAll();
    }

    public Flux<Reward> pray(String quantity) {
        return rewardRepository.findRandomRewards(quantity);
    }
}
