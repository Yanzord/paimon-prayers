package com.github.yanzord.service;

import com.github.yanzord.paimonprayers.repository.RewardRepository;
import com.github.yanzord.paimonprayers.service.PrayService;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class PrayServiceTest {
    @MockBean
    private RewardRepository rewardRepository;

    @InjectMocks
    private PrayService prayService;
}
