package net.cho.api.item.Quiz.Controller;

import lombok.RequiredArgsConstructor;
import net.cho.api.item.Quiz.domain.Quiz;
import net.cho.api.item.Quiz.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/quizzes")
public class QuizController {
    private final QuizService quizService;

    @GetMapping("/random")
    public ResponseEntity<Mono<Quiz>> getQuiz(){
        return ResponseEntity.ok(quizService.createQuiz());
    }
}
