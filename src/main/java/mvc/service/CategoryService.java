package mvc.service;

import mvc.entity.CategoryEntity;
import mvc.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    public List<CategoryEntity> getAllCate() {
        return (List<CategoryEntity>) categoryRepository.findAll();
    }
}
