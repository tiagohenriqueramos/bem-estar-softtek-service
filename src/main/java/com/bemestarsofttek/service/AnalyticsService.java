package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.Analytics;
import com.bemestarsofttek.repository.AnalyticsRespository;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class AnalyticsService {

    private final AnalyticsRespository analyticsRespository;

    public AnalyticsService(AnalyticsRespository analyticsRespository) {
        this.analyticsRespository = analyticsRespository;

    }

    public Analytics salvar(Analytics analytics) {
        return analyticsRespository.save(analytics);
    }

    public Analytics buscarPorId(ObjectId id) {
        return analyticsRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analytics não encontrado"));
    }

    public Page<Analytics> listar(Pageable pageable) {
        return analyticsRespository.findAll(pageable);
    }

    public void deleteById(ObjectId id) {
        if (analyticsRespository.existsById(id)) {
            analyticsRespository.deleteById(id);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

    public Analytics atualizar(Analytics analytics) {
        if (analyticsRespository.existsById(analytics.getId())) {
            return analyticsRespository.save(analytics);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

}