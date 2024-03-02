package thiruvalluvar_goverment_college.department_publications;

import java.util.List;
import java.util.Optional;

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

    public Optional<tgacEntity> findone(int id) {
        return repo.findById(id);
    }

    public void deletebyid(int id) {
        repo.deleteById(id);
    }

    public List<tgacEntity> findusingisbn(String name) {
        return repo.findByAuthor(name);
    }

    public List<tgacEntity> ascendingorderbyyear() {
        return repo.findAllOrderByYearofpublicationList();
    }
}