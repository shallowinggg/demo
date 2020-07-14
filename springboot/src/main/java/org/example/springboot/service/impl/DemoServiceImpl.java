package org.example.springboot.service.impl;

import org.example.springboot.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author shallowinggg
 * @date 2020/7/14
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String foo(int arg) {
        return "Hello " + arg;
    }
}
