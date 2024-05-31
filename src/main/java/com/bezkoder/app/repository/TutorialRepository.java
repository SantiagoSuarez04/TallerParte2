package com.bezkoder.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.bezkoder.app.domain.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String tittle);
}
