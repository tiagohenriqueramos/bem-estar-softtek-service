package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.MoodEntry;
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
    public MoodEntry salvar(MoodEntry moodEntry) {
        return moodEntryRespository.save(moodEntry);
    }

    public MoodEntry buscarPorId(ObjectId id) {
        return moodEntryRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("MoodEntry não encontrado"));
    }

    public List<MoodEntry> listar() {
        return moodEntryRespository.findAll();
    }

    public void deleteById(ObjectId id) {
        if (moodEntryRespository.existsById(id)) {
            moodEntryRespository.deleteById(id);
        } else {
            throw new RuntimeException("MoodEntry não encontrado");
        }
    }

    public MoodEntry atualizar(MoodEntry moodEntry) {
        if (moodEntryRespository.existsById(moodEntry.getId())) {
            return moodEntryRespository.save(moodEntry);
        } else {
            throw new RuntimeException("MoodEntry não encontrado");
        }
    }

    public List<MoodEntry> listarPorPeriodo(LocalDate dataInicial, LocalDate dataFinal) {
        return moodEntryRespository.findByDateBetween(dataInicial, dataFinal);
    }
}
