package org.example.user;

import org.springframework.data.domain.Page;

import java.util.List;

public interface IUserService {

    User save(User user);

    User getById(Long id);

    List<User> getAll();

    void update(User user);

    void delete(Long id);

    Page<User> getAllWithPage(int page, int pageSize);

}
