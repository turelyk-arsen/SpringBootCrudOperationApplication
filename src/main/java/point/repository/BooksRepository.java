package point.repository;

import org.springframework.data.repository.CrudRepository;

import point.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
