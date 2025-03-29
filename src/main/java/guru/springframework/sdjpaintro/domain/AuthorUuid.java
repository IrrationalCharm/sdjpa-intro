package guru.springframework.sdjpaintro.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.Type;

import java.sql.Types;
import java.util.UUID;

@Entity
public class AuthorUuid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JdbcTypeCode(value = Types.VARCHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

    private String first_name;
    private String last_name;

    public AuthorUuid() {

    }

    public AuthorUuid(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public UUID getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
