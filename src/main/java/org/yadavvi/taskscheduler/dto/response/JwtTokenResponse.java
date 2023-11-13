package org.yadavvi.taskscheduler.dto.response;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Builder
public class JwtTokenResponse {
    @NonNull
    private String token;
    @NonNull
    private LocalDateTime expiresAt;
}
