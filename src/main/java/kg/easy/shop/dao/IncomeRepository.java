package kg.easy.shop.dao;

import kg.easy.shop.models.entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
