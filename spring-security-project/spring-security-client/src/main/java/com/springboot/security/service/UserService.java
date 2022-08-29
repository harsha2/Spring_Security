package com.springboot.security.service;

import com.springboot.security.entity.User;
import com.springboot.security.entity.VerificationToken;
import com.springboot.security.model.UserModel;

import java.util.Optional;

public interface UserService {


    Optional<User> getUserByPasswordResetToken(String token);

    User registerUser(UserModel model);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
