package lk.ijse.gdse.ticketservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.ticketservice.convertion.Converte;
import lk.ijse.gdse.ticketservice.dto.TicketDTO;
import lk.ijse.gdse.ticketservice.repository.TicketServiceDAO;
import lk.ijse.gdse.ticketservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Amil Srinath
 */

@Service
@Transactional
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketServiceDAO ticketServiceDAO;
    @Autowired
    private Converte converte;

    @Override
    public void save(TicketDTO ticketDTO) {
        ticketServiceDAO.save(converte.convertToEntity(ticketDTO));
    }

    @Override
    public void updateStatus(TicketDTO ticketDTO) {
        ticketServiceDAO.findById(ticketDTO.getTicketId()).ifPresentOrElse(ticket -> {
            ticket.setStatus(ticketDTO.getStatus());
            ticketServiceDAO.save(ticket);
        }, () -> {
            ticketServiceDAO.save(converte.convertToEntity(ticketDTO));
        });
    }

    @Override
    public List<TicketDTO> getAll() {
        return converte.convertToDTOs(ticketServiceDAO.findAll());
    }
}
