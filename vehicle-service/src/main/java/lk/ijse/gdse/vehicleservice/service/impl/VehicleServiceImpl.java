package lk.ijse.gdse.vehicleservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.vehicleservice.convertion.Converte;
import lk.ijse.gdse.vehicleservice.dto.VehicleDTO;
import lk.ijse.gdse.vehicleservice.repository.VehicleServiceDAO;
import lk.ijse.gdse.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Amil Srinath
 */
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleServiceDAO vehicleServiceDAO;

    @Autowired
    private Converte converte;

    @Override
    public void save(VehicleDTO vehicleDTO) {
        vehicleServiceDAO.save(converte.convertToEntity(vehicleDTO));
    }

    @Override
    public List<VehicleDTO> getAll() {
        return converte.convertToDTOs(vehicleServiceDAO.findAll());
    }
}
