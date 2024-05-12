package net.zhaoxiaobin.service.impl;

import net.zhaoxiaobin.service.IDubboService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * dubbo测试service接口实现类
 *
 * @author zhaoxb
 * @date 2024-05-12 下午4:01
 */
@DubboService
public class DubboServiceImpl implements IDubboService {
    private static final Logger logger = LoggerFactory.getLogger(DubboServiceImpl.class);

    /**
     * 公共api接口，输出hello + name
     *
     * @param name
     * @return
     */
    @Override
    public String hello(String name) {
        logger.info("hello:{}", name);
        return "hello:" + name;
    }
}