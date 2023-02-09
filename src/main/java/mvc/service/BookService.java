package mvc.service;

import mvc.entity.BookEntity;
import mvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<BookEntity> getAllBook(){
        return (List<BookEntity>) bookRepository.findAll();
    }


    public void saveBook(BookEntity book) {
        bookRepository.save(book);
    }

    public void deleteBookById(int id) {
        bookRepository.deleteById(id);

    }

    public List<BookEntity> findByNameContainingOrAuthorContaining(String searchInPut, String searchInPut1) {
        return bookRepository.findByNameContainingOrAuthorContaining(searchInPut,searchInPut);
    }

    public Object getByID(int id) {
        return bookRepository.findById(id);
    }
}
