package net.cho.api.item.Quiz.service;


import net.cho.api.item.Quiz.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> createQuiz();
}
