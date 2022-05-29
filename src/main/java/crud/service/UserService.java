package crud.service;

import crud.model.User;
import java.util.List;

public interface UserService {

    List<User> read();

    void save(User user);

    void delete(int id);

    void update(User updateUser);

    User getById(int id);
}
