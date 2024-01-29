package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity(name = "abc")
public class Abc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pnr;
    private String reservationFrom;
    private String reservationTo;
    private int trainNumber;
    private String trainName;
    private String classType;

    private String dateOfJourney;

   /* @ManyToOne
    @JoinColumn(name = "userId")
    private  User user;*/





}
