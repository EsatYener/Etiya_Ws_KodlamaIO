package KodlamaIO;
import WS3.Technology;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {
    private final List<Category> categories;

    public CategoryManager() {
        categories = new ArrayList<>();
        categories.add(new Category(1, "Programming"));
        categories.add(new Category(2, "Design"));
    }

    public List<Category> getAll() {
        return categories;
    }

    public Category getById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public void add(Category category) {
        categories.add(category);
    }

    public void update(Category category) {
        for (Category updateCategory : categories) {
            if (updateCategory.getId() == category.getId()) {
                updateCategory.setName(category.getName());
            }
        }
    }

    public void delete(int id) {
        Iterator<Category> iterator = categories.iterator();
        while (iterator.hasNext()) {
            Category category = iterator.next();
            if (category.getId() == id) {
                iterator.remove();
            }
        }
    }

    public String getCategoryNameById(int categoryId) {

        for(Category category: categories){
            if(category.getId()==categoryId){
                return category.getName();
            }

        }
        return null;
    }




}


