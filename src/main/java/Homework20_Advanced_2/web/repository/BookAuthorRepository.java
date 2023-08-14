package Homework20_Advanced_2.web.repository;

import Homework20_Advanced_2.support.jpa.CustomJpaRepository;
import Homework20_Advanced_2.web.entity.Author;
import Homework20_Advanced_2.web.entity.Book;
import Homework20_Advanced_2.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
