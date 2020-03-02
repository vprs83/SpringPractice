package library.Configuration;

import library.Entity.Book;
import library.Services.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CommonConfiguration {
    @Inject
    BookService bookService;

    @Bean
    void fillDatabase(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("fantastic1"));
        bookList.add(new Book("fantastic2"));
        bookList.add(new Book("fantastic3"));
        bookService.bookList = bookList;
        }
    }
