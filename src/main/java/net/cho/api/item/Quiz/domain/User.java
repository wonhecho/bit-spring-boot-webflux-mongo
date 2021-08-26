package net.cho.api.item.Quiz.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Document(collation = "users")
@Getter @ToString @RequiredArgsConstructor @EqualsAndHashCode
public class User implements Serializable {
    @Id
    private final String userid;
    private final String alias;

}
