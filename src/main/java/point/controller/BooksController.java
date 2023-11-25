package point.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import point.model.Books;
import point.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@GetMapping("/book")
	private List<Books> getAllBooks() {
		return booksService.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	private Books getBooks (@PathVariable int id) {
		return booksService.getBooksById(id);
	}
	
	@DeleteMapping("/book/{id}")
	private void deleteBook (@PathVariable int id) {
		booksService.deleteBookById(id);
	}
	
	@PostMapping("/books")
	private int saveBook (@RequestBody Books books) {
		booksService.saveBook(books);
		return books.getBookid();
	}
	
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
	
	

}
