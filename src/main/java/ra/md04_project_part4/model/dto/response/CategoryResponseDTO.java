package ra.md04_project_part4.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ra.md04_project_part4.model.entity.Category;
import ra.md04_project_part4.model.entity.Product;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoryResponseDTO {
    private Long id;
    private String categoryName;
    private boolean status;
    @JsonIgnore
    private Set<Product> products;

    public CategoryResponseDTO(Category category) {
        this.id = category.getId();
        this.categoryName = category.getCategoryName();
        this.status = category.isStatus();
        this.products = category.getProducts();
    }
}
