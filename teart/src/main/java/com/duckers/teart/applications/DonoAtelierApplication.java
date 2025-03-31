package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.repositories.DonoAtelierRepository;
import org.springframework.stereotype.Service;

@Service
public class DonoAtelierApplication {
    private DonoAtelierRepository donoAtelierRepositorie;

    public DonoAtelierApplication(DonoAtelierRepository donoAtelierRepositorie) {
        this.donoAtelierRepositorie = donoAtelierRepositorie;
    }

    public void createDonoAtelier(DonoAtelier donoAtelier) {
        donoAtelierRepositorie.createDonoAtelier(donoAtelier);
    }

    public DonoAtelier getDonoAtelierById(long id) {
        return donoAtelierRepositorie.getDonoAtelierById(id);
    }

    public List<DonoAtelier> getAllDonoAteliers() {
        return donoAtelierRepositorie.getDonoAteliersList();
    }

    public void updateDonoAtelier(long id, DonoAtelier donoAtelier) {
        donoAtelierRepositorie.updateDonoAtelier(id, donoAtelier);
    }

    public void deleteDonoAtelier(long id) {
        donoAtelierRepositorie.deleteDonoAtelier(id);
    }
}
