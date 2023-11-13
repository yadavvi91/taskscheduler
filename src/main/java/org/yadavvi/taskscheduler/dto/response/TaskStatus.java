package org.yadavvi.taskscheduler.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Builder
public class TaskStatus {

    @Getter
    @AllArgsConstructor
    public enum StatusEnum {
        NOT_STARTED("Not Started"),
        IN_PROGRESS("In Progress"),
        COMPLETED("Completed");
        private final String value;
    }

    public String id;
    public StatusEnum status;
    public Integer progressPercentage;
    private LocalDateTime timeStamp;
}