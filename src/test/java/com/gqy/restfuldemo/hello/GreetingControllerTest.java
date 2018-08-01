package com.gqy.restfuldemo.hello;

import com.gqy.restfuldemo.hello.GreetingController;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* GreetingController Tester.
*
* @author Cady
* @since <pre>???? 30, 2018</pre>
* @version 1.0
*/
@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

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
    * Method: greeting(@RequestParam(value="name", defaultValue="World") String name)
    *
    */
    @Test
    public void testGreeting() throws Exception {
        this.mvc.perform(get("/greeting").param("name","Test").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(jsonPath("$.length").value(2));
    }


}
