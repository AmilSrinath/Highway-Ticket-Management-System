package lk.ijse.gdse.ticketservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Amil Srinath
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketDTO {
    private String ticketId;
    private String vehicleId;
    private String userId;
    private Date issueDate;
    private String status;
}
