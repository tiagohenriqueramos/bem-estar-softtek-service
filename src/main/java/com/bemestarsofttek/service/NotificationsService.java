package com.bemestarsofttek.service;

import com.bemestarsofttek.domain.Notifications;
import com.bemestarsofttek.repository.NotificationsRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsService {


    private final NotificationsRepository notificationsRepository;

    public NotificationsService(NotificationsRepository notificationsRepository) {
        this.notificationsRepository = notificationsRepository;

    }

    public Notifications salvar(Notifications notifications) {
        return notificationsRepository.save(notifications);
    }

    public Notifications buscarPorId(ObjectId id) {
        return notificationsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analytics não encontrado"));
    }

    public List<Notifications> listar() {
        return notificationsRepository.findAll();
    }

    public void deleteById(ObjectId id) {
        if (notificationsRepository.existsById(id)) {
            notificationsRepository.deleteById(id);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

    public Notifications atualizar(Notifications notifications) {
        if (notificationsRepository.existsById(notifications.getId())) {
            return notificationsRepository.save(notifications);
        } else {
            throw new RuntimeException("Analytics não encontrado");
        }
    }

}
