/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code>
 * schema
 */
@Generated(value = { "https://www.jooq.org",
		"jOOQ version:3.8.2" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<Record> CONSTRAINT_C = UniqueKeys0.CONSTRAINT_C;

	public static final UniqueKey<Record> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;

	public static final UniqueKey<Record> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;

	public static final UniqueKey<Record> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;

	public static final UniqueKey<Record> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<Record, Record> FK_BOOK_AUTHOR = ForeignKeys0.FK_BOOK_AUTHOR;

	public static final ForeignKey<Record, Record> FK_BOOK_LANGUAGE = ForeignKeys0.FK_BOOK_LANGUAGE;

	public static final ForeignKey<Record, Record> FK_B2BS_BOOK_STORE = ForeignKeys0.FK_B2BS_BOOK_STORE;

	public static final ForeignKey<Record, Record> FK_B2BS_BOOK = ForeignKeys0.FK_B2BS_BOOK;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {

		public static final UniqueKey<Record> CONSTRAINT_C = createUniqueKey(
				Language.LANGUAGE, "CONSTRAINT_C", Language.LANGUAGE.ID);

		public static final UniqueKey<Record> CONSTRAINT_7 = createUniqueKey(
				Author.AUTHOR, "CONSTRAINT_7", Author.AUTHOR.ID);

		public static final UniqueKey<Record> CONSTRAINT_1 = createUniqueKey(Book.BOOK,
				"CONSTRAINT_1", Book.BOOK.ID);

		public static final UniqueKey<Record> CONSTRAINT_F = createUniqueKey(
				BookStore.BOOK_STORE, "CONSTRAINT_F", BookStore.BOOK_STORE.NAME);

		public static final UniqueKey<Record> CONSTRAINT_2 = createUniqueKey(
				BookToBookStore.BOOK_TO_BOOK_STORE, "CONSTRAINT_2",
				BookToBookStore.BOOK_TO_BOOK_STORE.NAME,
				BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);

	}

	private static class ForeignKeys0 extends AbstractKeys {

		public static final ForeignKey<Record, Record> FK_BOOK_AUTHOR = createForeignKey(
				sample.jooq.domain.Keys.CONSTRAINT_7, Book.BOOK, "FK_BOOK_AUTHOR",
				Book.BOOK.AUTHOR_ID);

		public static final ForeignKey<Record, Record> FK_BOOK_LANGUAGE = createForeignKey(
				sample.jooq.domain.Keys.CONSTRAINT_C, Book.BOOK, "FK_BOOK_LANGUAGE",
				Book.BOOK.LANGUAGE_ID);

		public static final ForeignKey<Record, Record> FK_B2BS_BOOK_STORE = createForeignKey(
				sample.jooq.domain.Keys.CONSTRAINT_F, BookToBookStore.BOOK_TO_BOOK_STORE,
				"FK_B2BS_BOOK_STORE", BookToBookStore.BOOK_TO_BOOK_STORE.NAME);

		public static final ForeignKey<Record, Record> FK_B2BS_BOOK = createForeignKey(
				sample.jooq.domain.Keys.CONSTRAINT_1, BookToBookStore.BOOK_TO_BOOK_STORE,
				"FK_B2BS_BOOK", BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);

	}

}
