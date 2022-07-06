package org.example.user;

import lombok.AllArgsConstructor;
import org.example.exception.AccessDeniedException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService{

    protected final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        if(optional.isEmpty()){
            throw new AccessDeniedException("Not Found");
        }
        return optional.get();
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void update(User user) {
        User newUser = getById(user.getId());
        newUser.setBlood(user.getBlood());
        newUser.setBirthPlace(user.getBirthPlace());
        newUser.setName(user.getName());
        newUser.setLastName(user.getLastName());
        newUser.setFatherName(user.getFatherName());
        newUser.setNationalCode(user.getNationalCode());
        userRepository.save(newUser);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> getAllWithPage(int page, int pageSize) {
        return null;
    }

}
