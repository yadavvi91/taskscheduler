package org.yadavvi.taskscheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yadavvi.taskscheduler.dto.RestResponse;
import org.yadavvi.taskscheduler.dto.request.SignupRequest;
import org.yadavvi.taskscheduler.dto.response.SignupResponse;
import org.yadavvi.taskscheduler.service.AuthenticationService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<RestResponse<SignupResponse>> signup(@RequestBody @Valid SignupRequest request) {
        SignupResponse response = authenticationService.signup(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(RestResponse.of(response));
    }

}
