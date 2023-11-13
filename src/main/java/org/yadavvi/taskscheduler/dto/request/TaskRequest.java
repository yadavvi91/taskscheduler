package org.yadavvi.taskscheduler.dto.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class TaskRequest {
    public String title;
    public String description;
    public LocalDate dueDate;
}
