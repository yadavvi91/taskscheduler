package org.yadavvi.taskscheduler.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import org.yadavvi.taskscheduler.model.UserSpringSecurity;

import java.util.Date;

@Component
public class JwtTokenProvider {
    @Value("${application.secret}")
    private String APP_SECRET;

    @Value("${application.expires.in}")
    private long EXPIRES_IN;

    public String generateJwtToken(Authentication authentication) {
        UserSpringSecurity userPrincipal = (UserSpringSecurity) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + EXPIRES_IN))
                .signWith(SignatureAlgorithm.HS512, APP_SECRET)
                .compact();
    }

    public boolean validateJwtToken(String jwt) {
        return true;
    }

    public String getUserNameFromJwtToken(String jwt) {
        return "admin";
    }
}
