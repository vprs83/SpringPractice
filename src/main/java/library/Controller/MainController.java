package library.Controller;

import library.Entity.Book;
import library.Services.BookService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
public class MainController {
    BookService bookService;

    @GetMapping("/get")
    Book getBook(){ return new Book();}

    @GetMapping(value={"/", "/getAll"})
    List<Book> getAllBooks(){return bookService.bookList;}

    @PostMapping("/modify")
    String modifyBook(){return "mod";}

    @PutMapping("/upload")
    String uploadBook() {
        String uploadBook (@RequestBody Book insertRequest){
            bookService.saveBook(insertRequest)
            return "book succesfully added";
        }
    }
    @DeleteMapping("/delete")
    String deleteBook(){return "del";}

}
