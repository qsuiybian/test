package com.gqy.restfuldemo;

import com.gqy.restfuldemo.ProductController;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* ProductController Tester.
*
* @author Cady
* @since <pre>???? 31, 2018</pre>
* @version 1.0
*/
@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

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
    * Method: getProduct()
    *
    */
    @Test
    public void testGetProduct() throws Exception {
        this.mvc.perform(get("/sell/buyer/product/list").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}
