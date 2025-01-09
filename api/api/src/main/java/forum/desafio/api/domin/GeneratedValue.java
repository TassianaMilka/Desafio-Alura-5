package forum.desafio.api.domin;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {
    GenerationType strategy();
}
