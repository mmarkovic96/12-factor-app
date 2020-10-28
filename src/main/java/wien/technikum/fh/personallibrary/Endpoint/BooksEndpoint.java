package wien.technikum.fh.personallibrary.Endpoint;

import org.springframework.web.bind.annotation.*;
import wien.technikum.fh.personallibrary.BooksService;
import wien.technikum.fh.personallibrary.Entity.Book;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/books")
public class BooksEndpoint {

    private final BooksService booksService;

    public BooksEndpoint(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> findAll() {
        return booksService.getMyBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book findById(@PathVariable Long id) {
        return booksService.getBookById(id);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Optional<Book> find(@PathVariable String name) {
        return booksService.getBookByName(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book publishMessage(@RequestBody Book book) {

        return booksService.saveBook(book);
    }
}
