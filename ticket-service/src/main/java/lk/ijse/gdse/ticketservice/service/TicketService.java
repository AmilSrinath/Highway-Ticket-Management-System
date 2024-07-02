package lk.ijse.gdse.ticketservice.service;

import lk.ijse.gdse.ticketservice.dto.TicketDTO;

import java.util.List;

/**
 * @author Amil Srinath
 */
public interface TicketService {
    void save(TicketDTO ticketDTO);
    void updateStatus(TicketDTO ticketDTO);
    List<TicketDTO> getAll();
    boolean isExistsUser(String userId);
    boolean isExistsVehicle(String vehicleId);
}
