package com.usa.ciclo4.reto2ciclo4.repository;

import com.usa.ciclo4.reto2ciclo4.model.User;
import com.usa.ciclo4.reto2ciclo4.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User> Listar(){
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id){
        return userCrudRepository.findById(id);
    }

    public User save(User user){
        return userCrudRepository.save(user);
    }

    public void update(User user){
        userCrudRepository.save(user);
    }

    public void delete(User user){
        userCrudRepository.delete(user);
    }

    public boolean emailExists(String email){
        Optional<User> user = userCrudRepository.findByEmail(email);
        return user.isPresent();
    }

    public boolean getCleaningUser(Integer id){
        Optional<User> user = userCrudRepository.findById(id);
        return user.isPresent();
    }

    public Optional<User> authenticateUser(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

    public Optional<User> getUserByNameOrEmail(String name, String email){
        return userCrudRepository.findByNameOrEmail(name, email);
    }

    public List<User> idExists(Integer id) {
        return null;
    }

    public List<User> birthtDayList(Date monthBirthtDay) {
        return userCrudRepository.findByMonthBirthtDay(monthBirthtDay);
    }
}
