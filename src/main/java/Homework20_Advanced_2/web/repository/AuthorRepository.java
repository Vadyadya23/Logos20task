package Homework20_Advanced_2.web.repository;

import java.util.Set;

import Homework20_Advanced_2.support.jpa.CustomJpaRepository;
import Homework20_Advanced_2.web.entity.Author;

/**
 * <b>Author Repository</b><br>
 * You can use NamedQuery or Query annotation here.
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface AuthorRepository extends CustomJpaRepository<Author, Long> {

	public Author findByAuthorName(String authorName);

	public Set<Author> findByAuthorBooks_Book_Id(Long bookId);
}
