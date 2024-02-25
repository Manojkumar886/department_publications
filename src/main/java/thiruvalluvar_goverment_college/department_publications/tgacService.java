package thiruvalluvar_goverment_college.department_publications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tgacService {
    @Autowired // object creation
    tgacRepository repo;

    public tgacEntity makeCreate(tgacEntity journaldetails) {
        return repo.save(journaldetails);
    }

    public List<tgacEntity> makeAll() {
        return repo.findAll();
    }
}