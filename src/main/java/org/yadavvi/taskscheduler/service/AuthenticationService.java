package org.yadavvi.taskscheduler.service;

import org.springframework.stereotype.Service;
import org.yadavvi.taskscheduler.dto.request.JwtTokenRequest;
import org.yadavvi.taskscheduler.dto.request.SignupRequest;
import org.yadavvi.taskscheduler.dto.response.JwtTokenResponse;
import org.yadavvi.taskscheduler.dto.response.SignupResponse;

@Service
public class AuthenticationService {

    public SignupResponse signup(SignupRequest request) {
        return null;
    }

    public JwtTokenResponse login(JwtTokenRequest request) {
        return null;
    }
}
