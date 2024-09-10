package org.example.billsSplitApp.service;
import org.example.billsSplitApp.model.User;
import org.example.billsSplitApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.sql.Blob;
import java.util.List;

@Service
public class UserService {
        private final UserRepository userRepository;

        @Autowired
        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }

        public User getUserById(Long id) {
            return userRepository.findById(id).orElse(null);
        }

        public User saveUser(User user) {
            return userRepository.save(user);
        }

        public void deleteUser(Long id) {
            userRepository.deleteById(id);
        }
    }