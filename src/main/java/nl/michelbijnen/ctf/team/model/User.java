package nl.michelbijnen.ctf.team.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private String id;
    private String username;
    @OneToOne
    private Team team;
    private String hash;
    private String salt;
    private String secretKey;
}
