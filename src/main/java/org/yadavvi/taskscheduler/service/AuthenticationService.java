package org.yadavvi.taskscheduler.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.yadavvi.taskscheduler.dto.request.JwtTokenRequest;
import org.yadavvi.taskscheduler.dto.request.SignupRequest;
import org.yadavvi.taskscheduler.dto.response.JwtTokenResponse;
import org.yadavvi.taskscheduler.dto.response.SignupResponse;

@Service
public class AuthenticationService {

    private AuthenticationManager authenticationManager;

    public SignupResponse signup(SignupRequest request) {
        return null;
    }

    public JwtTokenResponse login(JwtTokenRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        return null;
    }
}
