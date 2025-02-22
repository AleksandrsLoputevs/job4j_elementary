package ru.exercise;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorld2Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld.main(null);
        assertThat(out.toString(), is("Hello, Job4j!" + System.lineSeparator()));
    }

}