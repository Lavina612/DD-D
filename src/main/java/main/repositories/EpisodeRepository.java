package main.repositories;

import main.entities.Episode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends CrudRepository<Episode, Long> {
    public Episode findBySeries(int series);
    public void deleteBySeries(int series);
}
