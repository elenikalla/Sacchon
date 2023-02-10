package pfizer.bootcamp.group5.Sacchon.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Doctor {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
