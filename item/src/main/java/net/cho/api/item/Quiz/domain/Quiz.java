package net.cho.api.item.Quiz.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter@ToString
public class Quiz {
    private int factorA;
    private int factorB;
    private int result;


    @Builder
    public Quiz(int factorA, int factorB){
        this.factorA = factorA;
        this.factorB = factorB;
        result = this.factorA*this.factorB;
    }
}
