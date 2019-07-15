package ru.metelev.domain;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import ru.metelev.domain.util.MessageHelper;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please fill the message")
    @Length(max = 2048, message = "Message too long (more 2048 chars)")
    @NonNull
    private String text;
    @Length(max = 255, message = "Tag is too long(more than 255 chars)")
    @NonNull
    private String tag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @NonNull
    private User author;
    private String filename;

    @ManyToMany
    @JoinTable(
            name="message_likes",
            joinColumns = {@JoinColumn(name = "message_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    private Set<User> likes = new HashSet<>();

    public String getAuthorName(){
        return MessageHelper.getAuthorName(author);
    }
}
