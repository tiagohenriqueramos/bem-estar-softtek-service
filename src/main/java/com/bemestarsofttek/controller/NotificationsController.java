package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.MoodEntries;
import com.bemestarsofttek.domain.Notifications;
import com.bemestarsofttek.service.MoodEntryService;
import com.bemestarsofttek.service.NotificationsService;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationsController {

    private final NotificationsService notificationsService;

    public NotificationsController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public Page<Notifications> listar(Pageable pageable) {
        return notificationsService.listar(pageable);
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Notifications buscarPorId(@PathVariable ObjectId id){
        return notificationsService.buscarPorId(id);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Notifications salvar(@RequestBody @Valid Notifications notifications) {
        return notificationsService.salvar(notifications);
    }


    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public Notifications atualizar(@RequestBody Notifications notifications) {
        return notificationsService.atualizar(notifications);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        notificationsService.deleteById(id);
    }

}
