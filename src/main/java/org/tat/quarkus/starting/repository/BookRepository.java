package org.tat.quarkus.starting.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.tat.quarkus.starting.entity.Book;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of( new Book("an","ty",4,5),
                new Book("asdn","ty",4,1));
    }

    public Optional<Book> getBook(Integer id) {
        return getAllBooks().stream().filter(book -> book.id == id ).findFirst();
    }
}
