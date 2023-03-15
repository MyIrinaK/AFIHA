package ru.netology.Menedger.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenedgerTest {


    @Test
    public void test() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");

        String[] expected = {"First1", "First2", "First3"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        String[] expected = {"First1", "First2", "First3", "First4", "First5"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        String[] expected = {"First1", "First2", "First3", "First4", "First5", "First6", "First7"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        String[] expected = {"First7", "First6", "First5", "First4", "First3", "First2", "First1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");

        String[] expected = {"First1", "First2", "First3", "First4", "First5", "First6", "First7"};
        String[] actual = afisha.findall();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");
        afisha.addFilm("First6");
        afisha.addFilm("First7");
        afisha.addFilm("First8");
        String[] expected = {"First8", "First7", "First6", "First5", "First4", "First3", "First2"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        Menedger afisha = new Menedger();
        afisha.addFilm("First1");
        afisha.addFilm("First2");
        afisha.addFilm("First3");
        afisha.addFilm("First4");
        afisha.addFilm("First5");

        String[] expected = {"First5", "First4", "First3", "First2", "First1"};
        String[] actual = afisha.findlast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
