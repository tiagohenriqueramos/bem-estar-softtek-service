package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.Assessments;
import com.bemestarsofttek.repository.AssessmentsRespository;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AssessmentsService {


    private final AssessmentsRespository assessmentsRespository;

    public AssessmentsService(AssessmentsRespository assessmentsRespository) {
        this.assessmentsRespository = assessmentsRespository;

    }

    public Assessments salvar(Assessments assessments) {
        return assessmentsRespository.save(assessments);
    }

    public Assessments buscarPorId(ObjectId id) {
        return assessmentsRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analytics não encontrado"));
    }

    public Page<Assessments> listar(Pageable pageable) {
        return assessmentsRespository.findAll(pageable);
    }

    public void deleteById(ObjectId id) {
        if (assessmentsRespository.existsById(id)) {
            assessmentsRespository.deleteById(id);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

    public Assessments atualizar(Assessments analytics) {
        if (assessmentsRespository.existsById(analytics.getId())) {
            return assessmentsRespository.save(analytics);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

}
