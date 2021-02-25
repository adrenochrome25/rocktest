package io.rocktest.web;

import io.rocktest.RockTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.Assert.*;

@SpringBootTest
public class Web extends RockTest {

    private static Logger LOG = LoggerFactory.getLogger(Web.class);

    @Test
    public void empty() {
    }


    @Test
    public void get() throws IOException, InterruptedException {
        String ret=run("/scen/web/web.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void error() throws IOException, InterruptedException {
        String ret=run("/scen/web/webError.yaml");
        assertNotNull("Scenario should fail",ret);
    }

    @Test
    public void angular() throws IOException, InterruptedException {
        String ret=run("/scen/web/angular.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void selector() throws IOException, InterruptedException {
        String ret=run("/scen/web/selector.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void submit() throws IOException, InterruptedException {
        String ret=run("/scen/web/submit.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void search() throws IOException, InterruptedException {
        String ret=run("/scen/web/websearch.yaml");
        assertNull("Scenario should succeed",ret);
    }

}
