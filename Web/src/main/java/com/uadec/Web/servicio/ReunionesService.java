package com.uadec.Web.servicio;

import com.uadec.Web.reunion.Reunion;
import com.uadec.Web.repositorio.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReunionesService {

    private final ReunionRepository reunionesRepository;

    @Autowired
    public ReunionesService(ReunionRepository reunionesRepository) {
        this.reunionesRepository = reunionesRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionesRepository.findAll();
    }

    public Reunion getReunionById(Long id) {
        return reunionesRepository.findById(id).orElse(null);
    }

    public Reunion saveReunion(Reunion reunion) {
        return reunionesRepository.save(reunion);
    }

    public void deleteReunionById(Long id) {
        reunionesRepository.deleteById(id);
    }

    // Otros métodos según sea necesario
}
