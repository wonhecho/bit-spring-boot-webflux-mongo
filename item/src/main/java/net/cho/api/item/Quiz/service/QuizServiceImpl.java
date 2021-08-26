package net.cho.api.item.Quiz.service;
import lombok.RequiredArgsConstructor;
import net.cho.api.item.Quiz.domain.Quiz;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service @RequiredArgsConstructor
public class QuizServiceImpl implements QuizService{
    private final GeneratorService generatorService;
    @Override
    public Mono<Quiz> createQuiz() {
        int factorA = generatorService.randomFactor();
        int factorB = generatorService.randomFactor();
        Quiz quiz = new Quiz(factorA , factorB);
        return Mono.just(quiz);
    }
}
