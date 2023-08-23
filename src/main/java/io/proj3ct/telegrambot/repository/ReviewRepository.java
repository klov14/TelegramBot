package io.proj3ct.telegrambot.repository;

import io.proj3ct.telegrambot.model.Review;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
