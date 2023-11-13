package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
@Builder
public class TaskProgressChangeRequest {
    @Size(min = 0, max = 100)
    public Integer progressPercentage;
}
