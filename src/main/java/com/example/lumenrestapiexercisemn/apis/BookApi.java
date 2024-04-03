package com.example.lumenrestapiexercisemn.apis;

import com.example.lumenrestapiexercisemn.models.Book;
import com.example.lumenrestapiexercisemn.models.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookApi {
    @GetMapping
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok(
                List.of(
                        new Book(
                                1,
                                "Pro Spring",
                                1300,
                                2500,
                                6,
                                new String[] {"English", "French"},
                                new Publisher(
                                        10,
                                        "Apress",
                                        "Park avenue",
                                        "Sector 1",
                                        "New York",
                                        "USA",
                                        "contact@apress.com"
                                )
                        ),
                        new Book(
                                2,
                                "Java In a Nutshell",
                                1000,
                                3000,
                                11,
                                new String[] {"English"},
                                new Publisher(
                                        11,
                                        "O'Reilly",
                                        "Park avenue",
                                        "Sector 1",
                                        "New York",
                                        "USA",
                                        "contact@oreilly.com"
                                )
                        )
                )
        );
    }

    @GetMapping("{bookId}")
    public ResponseEntity<Book> getById(@PathVariable int bookId) {
        return ResponseEntity.ok(
                new Book(
                        bookId,
                        "Pro Spring",
                        1300,
                        2500,
                        6,
                        new String[] {"English", "French"},
                        new Publisher(
                                10,
                                "Apress",
                                "Park avenue",
                                "Sector 1",
                                "New York",
                                "USA",
                                "contact@apress.com"
                        )
                )
        );
    }


    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book) {
        book.setTitle("Created Book");
        return ResponseEntity.ok(book);
    }

    @PutMapping("{bookId}")
    public ResponseEntity<Book> update(@PathVariable int bookId, @RequestBody Book book) {
        book.setTitle("Updated Book");
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteById(@PathVariable int bookId) {
        return ResponseEntity.noContent().build();
    }
}
