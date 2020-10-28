package wien.technikum.fh.personallibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wien.technikum.fh.personallibrary.Entity.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {

    Optional<Book> findOneByName(String name);

    List<Book> getAllByPublisher(String publisher);
}
