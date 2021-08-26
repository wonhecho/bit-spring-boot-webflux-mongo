package net.cho.api.item.Quiz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class GeneratorServiceImplTest {
    @Mock GeneratorServiceImpl generatorService;
    @BeforeEach
    void setUp() {
        generatorService = new GeneratorServiceImpl();  //null exception이 뜰 수가 있다.

    }
    @DisplayName("랜덤 값 발생 알고리즘 테스트")
    @Test
    void randomFactor() {
        List<Integer> randoms = IntStream.range(0,1000)
                .map(i -> generatorService.randomFactor())
                .boxed()
                .collect(Collectors.toList());
        assertThat(randoms).containsOnlyElementsOf(IntStream.range(11,100)
                .boxed()
                .collect(Collectors.toList()));
    }
}