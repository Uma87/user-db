package ru.telegram.userdb.srvice.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.telegram.userdb.entity.Users;
import ru.telegram.userdb.repositiry.UsersRepository;
import ru.telegram.userdb.srvice.UserService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;


    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<Users> findById(Long id) {
        return usersRepository.findById(id);
    }

    @Override
    public void save(Users users) {
        usersRepository.save(users);

    }

    @Override
    public void update(Users users) {
        usersRepository.save(users);

    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);

    }
}
