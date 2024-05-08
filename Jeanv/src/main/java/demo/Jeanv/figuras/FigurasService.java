package demo.Jeanv.figuras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FigurasService {
    @Autowired
    private FigurasRepository figurasRepository;

    public Figuras save(Figuras entity){
        return figurasRepository.save(entity);
    }

    public Figuras findById(long id){
        return figurasRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        figurasRepository.deleteById(id);
    }
}
