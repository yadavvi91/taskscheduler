package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;

@Data
@Builder
public class JwtTokenRequest {
    @NonNull
    @Size(min = 3, max = 20)
    private String username;
    @NonNull
    @Size(min = 6, max = 40)
    private String password;
}
