package org.yadavvi.taskscheduler.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponse {
    public String id;
    public String username;
    public String email;
    public String firstName;
    public String lastName;
    public List<TaskResponse> tasks;
}
