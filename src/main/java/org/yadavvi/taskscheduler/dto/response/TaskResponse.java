package org.yadavvi.taskscheduler.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaskResponse {
    public String id;
    public String title;
    public String description;
    public String due_date;
    public TaskStatus taskStatus;
}
