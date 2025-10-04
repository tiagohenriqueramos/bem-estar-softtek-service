package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.Analytics;
import com.bemestarsofttek.service.AnalyticsService;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/analytics")
public class AnalysticsController {

    private final AnalyticsService analyticsService;

    public AnalysticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Analytics> listar() {
        return analyticsService.listar();
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Analytics buscarPorId(@PathVariable ObjectId id) {
        return analyticsService.buscarPorId(id);
    }


    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Analytics salvar(@RequestBody @Valid Analytics analytics) {
        return analyticsService.salvar(analytics);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public Analytics atualizar(@RequestBody Analytics analytics) {
        return analyticsService.atualizar(analytics);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        analyticsService.deleteById(id);
    }

}
