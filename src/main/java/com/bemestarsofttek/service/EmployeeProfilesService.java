package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.EmployeeProfiles;
import com.bemestarsofttek.repository.EmployeeProfilesRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProfilesService {


    private final EmployeeProfilesRepository employeeProfilesRepository;

    public EmployeeProfilesService(EmployeeProfilesRepository employeeProfilesRepository) {
        this.employeeProfilesRepository = employeeProfilesRepository;

    }

    public EmployeeProfiles salvar(EmployeeProfiles employeeProfiles) {
        return employeeProfilesRepository.save(employeeProfiles);
    }

    public EmployeeProfiles buscarPorId(ObjectId id) {
        return employeeProfilesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analytics não encontrado"));
    }

    public List<EmployeeProfiles> listar() {
        return employeeProfilesRepository.findAll();
    }

    public void deleteById(ObjectId id) {
        if (employeeProfilesRepository.existsById(id)) {
            employeeProfilesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

    public EmployeeProfiles atualizar(EmployeeProfiles analytics) {
        if (employeeProfilesRepository.existsById(analytics.getId())) {
            return employeeProfilesRepository.save(analytics);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

}
