package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;
import org.yadavvi.taskscheduler.dto.response.TaskStatus;

@Data
@Builder
public class TaskStatusChangeRequest {
    public TaskStatus status;
}
