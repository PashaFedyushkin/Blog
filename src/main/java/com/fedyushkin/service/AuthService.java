package com.fedyushkin.service;

import com.fedyushkin.payload.request.LoginRequest;
import com.fedyushkin.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    public ResponseEntity authenticateUser(LoginRequest loginRequest);

    public ResponseEntity registerUser(SignupRequest signUpRequest);
}
