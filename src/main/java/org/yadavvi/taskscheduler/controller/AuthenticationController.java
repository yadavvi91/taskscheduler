package org.yadavvi.taskscheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yadavvi.taskscheduler.dto.RestResponse;
import org.yadavvi.taskscheduler.dto.request.JwtTokenRequest;
import org.yadavvi.taskscheduler.dto.request.SignupRequest;
import org.yadavvi.taskscheduler.dto.response.JwtTokenResponse;
import org.yadavvi.taskscheduler.dto.response.SignupResponse;
import org.yadavvi.taskscheduler.service.AuthenticationService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AuthenticationController {
    @Autowired
    private final AuthenticationService authenticationService;
    @Autowired
    private final AuthenticationManager authenticationManager;

    // public AuthenticationController(
    //         AuthenticationManager authenticationManager, AuthenticationService authenticationService) {
    //     this.authenticationManager = authenticationManager;
    //     this.authenticationService = authenticationService;
    // }

    @PostMapping("/signup")
    public ResponseEntity<RestResponse<SignupResponse>> signup(@RequestBody @Valid SignupRequest request) {
        SignupResponse response = authenticationService.signup(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(RestResponse.of(response));
    }

    @PostMapping("/login")
    public ResponseEntity<RestResponse<JwtTokenResponse>> login(@RequestBody @Valid JwtTokenRequest request) {
        Authentication authenticationRequest =
                UsernamePasswordAuthenticationToken.unauthenticated(request.getUsername(), request.getPassword());
        Authentication authenticationResponse =
                this.authenticationManager.authenticate(authenticationRequest);
        JwtTokenResponse response = authenticationService.login(request);
        return ResponseEntity.status(HttpStatus.OK).body(RestResponse.of(response));
    }
}
