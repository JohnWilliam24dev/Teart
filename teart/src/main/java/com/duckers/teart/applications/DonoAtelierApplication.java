package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.models.DonoAtelierModel;
import com.duckers.teart.repositories.DonoAtelierRepository;
import org.springframework.stereotype.Service;

@Service
public class DonoAtelierApplication {
    private DonoAtelierRepository donoAtelierRepository;

    public DonoAtelierApplication(DonoAtelierRepository donoAtelierRepository) {
        this.donoAtelierRepository = donoAtelierRepository;
    }

    public void createDonoAtelier(DonoAtelierModel donoAtelier) {
        donoAtelierRepository.createDonoAtelier(donoAtelier);
    }

    public DonoAtelierModel getDonoAtelierById(long id) {
        return donoAtelierRepository.getDonoAtelierById(id);
    }

    public List<DonoAtelierModel> getAllDonoAteliers() {
        return donoAtelierRepository.getDonoAteliersList();
    }

    public void updateDonoAtelier(DonoAtelierModel donoAtelier) {
        donoAtelierRepository.updateDonoAtelier(donoAtelier);
    }

    public void deleteDonoAtelier(long id) {
        donoAtelierRepository.deleteDonoAtelier(id);
    }
}
