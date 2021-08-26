package net.cho.api.item.Quiz.service;
import lombok.RequiredArgsConstructor;
import net.cho.api.item.Quiz.domain.Quiz;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class QuizServiceImpl implements QuizService{
    private final GeneratorService generatorService;
    @Override
    public Quiz createQuiz() {
        return new Quiz(
                generatorService.randomFactor(),
                generatorService.randomFactor()
        );
    }
}
