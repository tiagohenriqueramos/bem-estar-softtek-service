package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.MoodEntries;
import com.bemestarsofttek.repository.MoodEntryRespository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MoodEntryService {

    private final MoodEntryRespository moodEntryRespository;

    public MoodEntryService(MoodEntryRespository moodEntryRespository) {
        this.moodEntryRespository = moodEntryRespository;

    }

    public MoodEntries salvar(MoodEntries moodEntry) {
        return moodEntryRespository.save(moodEntry);
    }

    public MoodEntries buscarPorId(ObjectId id) {
        return moodEntryRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("MoodEntry não encontrado"));
    }

    public List<MoodEntries> listar() {
        return moodEntryRespository.findAll();
    }

    public void deleteById(ObjectId id) {
        if (moodEntryRespository.existsById(id)) {
            moodEntryRespository.deleteById(id);
        } else {
            throw new RuntimeException("MoodEntry não encontrado");
        }
    }

    public MoodEntries atualizar(MoodEntries moodEntry) {
        if (moodEntryRespository.existsById(moodEntry.getId())) {
            return moodEntryRespository.save(moodEntry);
        } else {
            throw new RuntimeException("MoodEntry não encontrado");
        }
    }

    public List<MoodEntries> listarPorPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
        return moodEntryRespository.findByDateBetween(dataInicial, dataFinal);
    }
}
