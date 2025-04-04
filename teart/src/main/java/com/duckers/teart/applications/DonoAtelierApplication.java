package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.repositories.DonoAtelierRepository;
import org.springframework.stereotype.Service;

@Service
public class DonoAtelierApplication {
    private DonoAtelierRepository donoAtelierRepository;

    public DonoAtelierApplication(DonoAtelierRepository donoAtelierRepository) {
        this.donoAtelierRepository = donoAtelierRepository;
    }

    public void createDonoAtelier(DonoAtelier donoAtelier) {
        donoAtelierRepository.createDonoAtelier(donoAtelier);
    }

    public DonoAtelier getDonoAtelierById(long id) {
        return donoAtelierRepository.getDonoAtelierById(id);
    }

    public List<DonoAtelier> getAllDonoAteliers() {
        return donoAtelierRepository.getDonoAteliersList();
    }

    public void updateDonoAtelier(DonoAtelier donoAtelier) {
        donoAtelierRepository.updateDonoAtelier(donoAtelier);
    }

    public void deleteDonoAtelier(long id) {
        donoAtelierRepository.deleteDonoAtelier(id);
    }
}
