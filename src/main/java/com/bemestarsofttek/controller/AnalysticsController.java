package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.Analytics;
import com.bemestarsofttek.domain.MoodEntries;
import com.bemestarsofttek.service.AnalyticsService;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api")
public class AnalysticsController {

    private final AnalyticsService analyticsService;

    public AnalysticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public Page<Analytics> listar(Pageable pageable) {
        return analyticsService.listar(pageable);
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Analytics buscarPorId(@PathVariable ObjectId id){
        return analyticsService.buscarPorId(id);
    }

    @GetMapping(value = "/listar-por-data", params = {"dataInicio", "dataFinal"})
    public List<Analytics> listarPorData(@RequestParam LocalDate dataInicial, @RequestParam LocalDate dataFinal) {
        return analyticsService.listarPorPeriodo(dataInicial, dataFinal);
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
