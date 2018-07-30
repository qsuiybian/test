package com.gqy.restfuldemo;

import org.springframework.web.bind.annotation.*;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-30
 */
@RestController
public class FourMethodController {

    /**
     * @Description getMethod
     * @Date: 16:44 2018-07-30
     * @Param
     * @return java.lang.String
     */
    @GetMapping(path = "/get")
    public String getMethod(@RequestParam(value="id",defaultValue = "0")int id){
        return new String("run the getMethod to get id="+id);
    }

    /**
     * @Description postMethod
     * @Date: 16:45 2018-07-30
     * @Param
     * @return java.lang.String
     */
    @PostMapping(path = "/post")
    public String postMethod(){
        return new String("run the postMethod");
    }

    /**
     * @Description putMethod
     * @Date: 16:47 2018-07-30
     * @Param
     * @return java.lang.String
     */
    @PutMapping(path = "/put")
    public String putMethod(){
        return new String("run the putMethod");
    }

    /**
     * @Description deleteMethod
     * @Date: 16:48 2018-07-30
     * @Param
     * @return java.lang.String
     */
    @DeleteMapping(path = "/delete")
    public String deleteMethod(){
        return new String("run the deleteMethod");
    }
}
