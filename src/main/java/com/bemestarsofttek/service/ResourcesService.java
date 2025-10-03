package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.Resources;
import com.bemestarsofttek.repository.ResourcesRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService {


    private final ResourcesRepository resourcesRepository;

    public ResourcesService(ResourcesRepository resourcesRepository) {
        this.resourcesRepository = resourcesRepository;

    }

    public Resources salvar(Resources resources) {
        return resourcesRepository.save(resources);
    }

    public Resources buscarPorId(ObjectId id) {
        return resourcesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analytics não encontrado"));
    }

    public List<Resources> listar() {
        return resourcesRepository.findAll();
    }

    public void deleteById(ObjectId id) {
        if (resourcesRepository.existsById(id)) {
            resourcesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

    public Resources atualizar(Resources resources) {
        if (resourcesRepository.existsById(resources.getId())) {
            return resourcesRepository.save(resources);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

}
