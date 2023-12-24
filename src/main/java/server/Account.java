package server;


import lombok.*;

import java.util.Date;

@Getter @Setter
@ToString @EqualsAndHashCode
@AllArgsConstructor @NoArgsConstructor
public class Account {

    private long code;
    private String nomClient;
    private Date creationDate;
    private double balance;

    public Account(long code, String nomClient, double balance) {
        this.code = code;
        this.nomClient = nomClient;
        this.balance = balance;
        this.creationDate = new Date();
    }

}
