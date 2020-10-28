package wien.technikum.fh.personallibrary;

import org.springframework.stereotype.Service;
import wien.technikum.fh.personallibrary.Entity.Book;
import wien.technikum.fh.personallibrary.Repository.BooksRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {


    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getMyBooks(){

        return booksRepository.findAll();
    }

    public Book getBookById(long id){
        return booksRepository.getOne(id);
    }

    public Optional<Book> getBookByName(String name){
        return booksRepository.findOneByName(name);
    }

    public List<Book> getBooksByPublisher(String publisher){

        return booksRepository.getAllByPublisher(publisher);
    }

    public Book saveBook(Book book){
        return booksRepository.save(book);

    }



}
