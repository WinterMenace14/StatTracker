package erik.dnd.StatTracker.service;

import erik.dnd.StatTracker.repository.StatsRepository;
import org.springframework.stereotype.Service;

@Service
public class StatService {

    private final StatsRepository repository;

    public StatService(StatsRepository repository) {
        this.repository = repository;
    }
}
