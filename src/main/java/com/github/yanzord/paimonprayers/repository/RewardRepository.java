package com.github.yanzord.paimonprayers.repository;

import com.github.yanzord.paimonprayers.model.Reward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.SampleOperation;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class RewardRepository {

    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;

    public Mono<Reward> save(Reward reward) {
        return reactiveMongoTemplate.save(reward);
    }

    public Flux<Reward> findAll() {
        return reactiveMongoTemplate.findAll(Reward.class);
    }

    public Flux<Reward> findRandomRewards(String quantity) {
        SampleOperation sampleOperation = Aggregation.sample(Long.parseLong(quantity));
        Aggregation aggregation = Aggregation.newAggregation(sampleOperation);

        return reactiveMongoTemplate.aggregate(aggregation, Reward.class.getSimpleName().toLowerCase(), Reward.class);
    }
}
