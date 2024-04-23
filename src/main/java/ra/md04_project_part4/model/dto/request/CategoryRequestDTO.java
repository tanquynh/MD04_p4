package ra.md04_project_part4.model.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoryRequestDTO {
    private Long id;
    @NotEmpty(message = "Category Name cannot be empty")
    private String categoryName;
    private boolean status = true;
}
