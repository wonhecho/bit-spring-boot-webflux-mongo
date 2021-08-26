package net.cho.api.item.Quiz.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode @Document(collation = "attempts")
public class Attempt implements Serializable {
    @Id
    private int id;
    private final User user;
    private final Quiz quiz;
    private final int result;
    private final boolean correct;

}
