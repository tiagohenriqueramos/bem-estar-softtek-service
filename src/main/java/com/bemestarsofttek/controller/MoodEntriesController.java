package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.MoodEntry;
import com.bemestarsofttek.service.MoodEntryService;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/mood-entries")
public class MoodEntriesController {

    private final MoodEntryService moodEntryService;

    public MoodEntriesController(MoodEntryService moodEntryService) {
        this.moodEntryService = moodEntryService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<MoodEntry> listar() {
        return moodEntryService.listar();
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MoodEntry buscarPorId(@PathVariable ObjectId id) {
        return moodEntryService.buscarPorId(id);
    }

    @GetMapping(value = "/listar-por-data", params = {"dataInicio", "dataFinal"})
    public List<MoodEntry> listarPorData(@RequestParam LocalDate dataInicial, @RequestParam LocalDate dataFinal) {
        return moodEntryService.listarPorPeriodo(dataInicial, dataFinal);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public MoodEntry salvar(@RequestBody @Valid MoodEntry moodEntries) {
        System.out.println("Recebendo requisição para salvar MoodEntries: " + moodEntries);
        return moodEntryService.salvar(moodEntries);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public MoodEntry atualizar(@RequestBody MoodEntry moodEntries) {
        return moodEntryService.atualizar(moodEntries);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        moodEntryService.deleteById(id);
    }

}
