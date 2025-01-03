package hexlet.code.dto.task;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class TaskDTO {
    private Long id;
    private Long index;
    private Date createdAt;
    private String status;
    @JsonProperty("assignee_id")
    private Long assigneeId;
    private String title;
    private String content;
    private Set<Long> taskLabelIds;
}
