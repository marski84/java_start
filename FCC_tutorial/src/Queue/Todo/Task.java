package Queue.Todo;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class Task implements Comparable<Task> {
    private String title;
    private String description;
    private Priority priority;

    public Task(String title, String description, Priority priority)  {
        this.description = description;
        this.priority = priority;
        this.title = title;
    }

    @Override
    public int compareTo(@NotNull Task o) {
        return -Integer.compare(o.getPriority().getValue(), this.getPriority().getValue());
    }
}
