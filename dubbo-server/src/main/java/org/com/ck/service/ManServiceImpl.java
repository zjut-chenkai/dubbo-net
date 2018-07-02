package org.com.ck.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.com.ck.dubbo.face.test.ManService;

@Service
public class ManServiceImpl implements ManService {

    @Override
    public String say(String word) {
        return  "我说：" + word;
    }
}
