package io.proj3ct.telegrambot.controller;

import io.proj3ct.telegrambot.model.Review;
import io.proj3ct.telegrambot.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private ReviewService reviewService;

    @PostMapping
    public Review submitForm(@RequestBody Review review){
        return reviewService.create(review);
    }
}
