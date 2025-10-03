package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.MoodEntries;
import com.bemestarsofttek.service.MoodEntryService;
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
public class MoodEntriesController {

    private final MoodEntryService moodEntryService;

    public MoodEntriesController(MoodEntryService moodEntryService) {
        this.moodEntryService = moodEntryService;
    }


    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public Page<MoodEntries> listar(Pageable pageable) {
        return moodEntryService.listar(pageable);
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MoodEntries buscarPorId(@PathVariable ObjectId id){
        return moodEntryService.buscarPorId(id);
    }

    @GetMapping(value = "/listar-por-data", params = {"dataInicio", "dataFinal"})
    public List<MoodEntries> listarPorData(@RequestParam LocalDate dataInicial, @RequestParam LocalDate dataFinal) {
        return moodEntryService.listarPorPeriodo(dataInicial, dataFinal);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public MoodEntries salvar(@RequestBody @Valid MoodEntries moodEntries) {
        return moodEntryService.salvar(moodEntries);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public MoodEntries atualizar(@RequestBody MoodEntries moodEntries) {
        return moodEntryService.atualizar(moodEntries);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        moodEntryService.deleteById(id);
    }

}
