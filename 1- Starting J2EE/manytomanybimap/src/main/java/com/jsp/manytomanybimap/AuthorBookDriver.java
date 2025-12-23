package com.jsp.manytomanybimap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytomanybimap.entity.Author;
import com.jsp.manytomanybimap.entity.Books;

public class AuthorBookDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nishigandha");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // --- Authors ---
        Author a1 = new Author();
        a1.setId(11);
        a1.setName("Dr. Abdul Kalam");
        a1.setNoOfBooks(300);
        a1.setEducation("Phd in Research");

        Author a2 = new Author();
        a2.setId(12);
        a2.setName("Nilu Phule");
        a2.setNoOfBooks(150);
        a2.setEducation("Bacheros in Arts");

        Author a3 = new Author();
        a3.setId(13);
        a3.setName("Shanta");
        a3.setNoOfBooks(250);
        a3.setEducation("Bachelors in Computer Science");

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(a1);
        authors.add(a2);
        authors.add(a3);

        // --- Books ---
        Books b1 = new Books();
        b1.setBid(21);
        b1.setBname("Wings of Fire");
        b1.setPrice(200.80);
        b1.setType("Motivational");
        b1.setAuthor(authors);
        

        Books b2 = new Books();
        b2.setBid(22);
        b2.setBname("Bade Acche Lagte Hai");
        b2.setPrice(120.80);
        b2.setType("Romantic");
        b2.setAuthor(authors);

        Books b3 = new Books();
        b3.setBid(23);
        b3.setBname("The Guiding Light");
        b3.setPrice(150.00);
        b3.setType("Spiritual");
        b3.setAuthor(authors);

        ArrayList<Books> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        a1.setBooks(books);
        a2.setBooks(books);
        a3.setBooks(books);

        // --- Persist ---
        et.begin();
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
        et.commit();

        System.out.println("✅ Many-to-Many Bidirectional Data Saved Successfully!");
    }
}
