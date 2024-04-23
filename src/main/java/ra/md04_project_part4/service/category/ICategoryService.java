package ra.md04_project_part4.service.category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.md04_project_part4.exception.CategoryException;
import ra.md04_project_part4.model.dto.request.CategoryRequestDTO;
import ra.md04_project_part4.model.dto.response.CategoryResponseDTO;

import java.util.List;

public interface ICategoryService {
    Page<CategoryResponseDTO> findAllWithPaginationAndSort(Pageable pageable);

    Page<CategoryResponseDTO> searchByNameWithPaginationAndSort(Pageable pageable, String name);

    CategoryResponseDTO findById(Long id) throws CategoryException;

    CategoryResponseDTO saveOrUpdate(CategoryRequestDTO categoryRequestDTO) throws CategoryException;

    void changeStatus(Long id) throws CategoryException;

    List<CategoryResponseDTO> findAllByStatus(boolean status);

    List<CategoryResponseDTO> findAll();
}
