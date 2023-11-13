package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;

@Data
@Builder
public class SignupRequest {
    @NonNull
    @Size(min = 3, max = 20)
    private String username;
    @NonNull
    @Size(min = 10, max = 50)
    private String email;
    @NonNull
    @Size(min = 6, max = 40)
    private String password;
    @NonNull
    @Size(min = 3, max = 20)
    private String firstName;
    @NonNull
    @Size(min = 3, max = 20)
    private String lastName;
}
