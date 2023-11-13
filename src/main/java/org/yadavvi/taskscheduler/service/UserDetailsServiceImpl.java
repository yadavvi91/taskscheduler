package org.yadavvi.taskscheduler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yadavvi.taskscheduler.model.User;
import org.yadavvi.taskscheduler.repository.TaskUserRepository;
import org.yadavvi.taskscheduler.repository.UserRepository;
import org.yadavvi.taskscheduler.security.JwtUserDetails;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final TaskUserRepository taskUserRepository;
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = taskUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        UserDetails userDetails = userRepository.findByUsername(username).orElseThrow();
        return JwtUserDetails.build(userDetails, user);
    }

}
