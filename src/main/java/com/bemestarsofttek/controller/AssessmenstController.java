package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.Assessments;
import com.bemestarsofttek.service.AssessmentsService;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/assessments")
public class AssessmenstController {

    private final AssessmentsService assessmentsService;

    public AssessmenstController(AssessmentsService assessmentsService) {
        this.assessmentsService = assessmentsService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Assessments> listar() {
        return assessmentsService.listar();
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Assessments buscarPorId(@PathVariable ObjectId id) {
        return assessmentsService.buscarPorId(id);
    }


    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Assessments salvar(@RequestBody @Valid Assessments assessments) {
        return assessmentsService.salvar(assessments);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public Assessments atualizar(@RequestBody Assessments assessments) {
        return assessmentsService.atualizar(assessments);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        assessmentsService.deleteById(id);
    }

}
