package ra.md04_project_part4.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ra.md04_project_part4.model.entity.Product;

@Transactional
public interface IProductRepository  extends JpaRepository<Product, Long> {
    Page<Product> findProductByProductName(Pageable pageable, String name);
    
}
