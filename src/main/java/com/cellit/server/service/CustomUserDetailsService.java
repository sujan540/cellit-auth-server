package com.cellit.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cellit.server.model.CustomUserDetails;
import com.cellit.server.model.User;
import com.cellit.server.repository.UserRepository;

/**
 * @author Sujan Maharjan
 * @since 4/20/2018
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByFirstName(username);

        userOptional
            .orElseThrow(()-> new UsernameNotFoundException("User not found!"));

        return userOptional
            .map(CustomUserDetails::new)
            .get();

    }
}
