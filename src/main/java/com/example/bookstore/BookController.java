package com.example.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@RestController
public class BookController {
    private final BookService bookService;
        public BookController(BookService bookService) {
            this.bookService = bookService;
        }
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
            return bookService.getBookById(id);
    }
    @PostMapping
    public Book createBook(@RequestBody Book book) {
            return bookService.createBook(book);
    }


}
