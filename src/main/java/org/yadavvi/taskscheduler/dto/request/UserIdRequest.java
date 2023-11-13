package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserIdRequest {
    public String userId;
}
