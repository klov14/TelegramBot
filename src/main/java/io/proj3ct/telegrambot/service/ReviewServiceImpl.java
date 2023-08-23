package io.proj3ct.telegrambot.service;

import io.proj3ct.telegrambot.model.Review;
import io.proj3ct.telegrambot.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;
    @Override
    public Review create(Review review) {
        return reviewRepository.save(review);
    }
}
