package point.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import point.model.Books;
import point.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(book -> books.add(book));
		return books;
	}
	
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}
	
	public void deleteBookById(int id) {
		booksRepository.deleteById(id);
	}
	
	public void saveBook (Books books) {
		booksRepository.save(books);
	}
	
	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}
}
