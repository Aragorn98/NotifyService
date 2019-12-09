package kz.iitu.jd3.notifyservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    private Long id;
    private String name;
    private String specialty;

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", title='" + name + '\'' +
                ", author='" + specialty + '\'' +
                '}';
    }
}
