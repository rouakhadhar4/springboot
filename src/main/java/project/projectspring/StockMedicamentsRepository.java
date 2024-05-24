package project.projectspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMedicamentsRepository extends JpaRepository<StockMedicaments, Long> {
    // Vous pouvez ajouter des méthodes supplémentaires spécifiques si nécessaire
}

