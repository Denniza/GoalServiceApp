package ru.metelev.repos;

import org.springframework.data.repository.CrudRepository;
import ru.metelev.domain.Message;
import ru.metelev.domain.User;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message,Long> {

    List<Message> findByTag(String tag);

    List<Message> findByAuthor(User user);

    List<Message> findByTagAfterAndAuthor(String tag, User user);
}
