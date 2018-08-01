package com.gqy.restfuldemo.log;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* LoggerTest Tester.
*
* @author <Authors name>
* @since <pre>???? 1, 2018</pre>
* @version 1.0
*/
@RunWith(SpringRunner.class)
@WebMvcTest(LoggerTest.class)
public class LoggerTestTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: testLog()
    *
    */
    @Test
    public void testTestLog() throws Exception {
        this.mvc.perform(get("/log")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}
