package com.atguigu.springmvc.test;

import org.junit.Test;
import org.springframework.http.HttpMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xujian
 * @create 2023-01-14 13:52
 */
public class Mytest {
    @Test
    public void testOne(){
        List<String> strings = Collections.unmodifiableList(
                Arrays.asList(
                        HttpMethod.PUT.name(),
                        HttpMethod.DELETE.name(),
                        HttpMethod.PATCH.name()
                )
        );
        System.out.println(strings);
        //[PUT, DELETE, PATCH]
    }
}
