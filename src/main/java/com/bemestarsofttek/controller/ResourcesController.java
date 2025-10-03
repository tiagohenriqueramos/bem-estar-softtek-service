package com.bemestarsofttek.controller;

import com.bemestarsofttek.domain.Notifications;
import com.bemestarsofttek.domain.Resources;
import com.bemestarsofttek.service.NotificationsService;
import com.bemestarsofttek.service.ResourcesService;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourcesController {

    private final ResourcesService resourcesService;

    public ResourcesController(ResourcesService resourcesService) {
        this.resourcesService = resourcesService;
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Resources> listar(Pageable pageable) {
        return resourcesService.listar();
    }

    @GetMapping("/listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Resources buscarPorId(@PathVariable ObjectId id){
        return resourcesService.buscarPorId(id);
    }

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Resources salvar(@RequestBody @Valid Resources resources) {
        return resourcesService.salvar(resources);
    }

    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.OK)
    public Resources atualizar(@RequestBody Resources resources) {
        return resourcesService.atualizar(resources);
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ObjectId id) {
        resourcesService.deleteById(id);
    }

}
