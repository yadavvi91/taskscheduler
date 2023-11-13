package org.yadavvi.taskscheduler.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListOfTaskResponse {
    private List<TaskResponse> tasks;
}
