package com.gqy.restfuldemo;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* FourMethodController Tester.
*
* @author Cady
* @since <pre>???? 30, 2018</pre>
* @version 1.0
*/
@RunWith(SpringRunner.class)
@WebMvcTest(FourMethodController.class)
public class FourMethodControllerTest {

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
    * Method: getMethod(@RequestParam(value="id",defaultValue = "0")int id)
    *
    */
    @Test
    public void testGetMethod() throws Exception {
        this.mvc.perform(get("/get").param("id","4")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string(Matchers.containsString("run the getMethod to get id=4")));
    }

    /**
    *
    * Method: postMethod()
    *
    */
    @Test
    public void testPostMethod() throws Exception {
        this.mvc.perform(post("/post")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("run the postMethod")));
    }

    /**
    *
    * Method: putMethod()
    *
    */
    @Test
    public void testPutMethod() throws Exception {
        this.mvc.perform(put("/put")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("run the putMethod")));
    }

    /**
    *
    * Method: deleteMethod()
    *
    */
    @Test
    public void testDeleteMethod() throws Exception {
        this.mvc.perform(delete("/delete")
                .accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("run the deleteMethod")));
    }


}
