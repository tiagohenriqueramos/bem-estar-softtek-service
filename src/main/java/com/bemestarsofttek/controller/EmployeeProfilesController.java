package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.EmployeeProfiles;
import com.bemestarsofttek.service.EmployeeProfilesService;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employee-profiles")
public class EmployeeProfilesController {

    private final EmployeeProfilesService employeeProfilesService;

    public EmployeeProfilesController(EmployeeProfilesService employeeProfilesService) {
        this.employeeProfilesService = employeeProfilesService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeProfiles> listar() {
        return employeeProfilesService.listar();
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeProfiles buscarPorId(@PathVariable ObjectId id) {
        return employeeProfilesService.buscarPorId(id);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeProfiles salvar(@RequestBody @Valid EmployeeProfiles employeeProfiles) {
        return employeeProfilesService.salvar(employeeProfiles);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeProfiles atualizar(@RequestBody EmployeeProfiles employeeProfiles) {
        return employeeProfilesService.atualizar(employeeProfiles);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        employeeProfilesService.deleteById(id);
    }

}
