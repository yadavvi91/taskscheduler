package org.yadavvi.taskscheduler.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {
    @Value("${application.secret}")
    private String APP_SECRET;

    @Value("${application.expires.in}")
    private long EXPIRES_IN;

    public String generateJwtToken(Authentication authentication) {
        JwtUserDetails userPrincipal = (JwtUserDetails) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + EXPIRES_IN))
                .signWith(SignatureAlgorithm.HS512, APP_SECRET)
                .compact();
    }

}
