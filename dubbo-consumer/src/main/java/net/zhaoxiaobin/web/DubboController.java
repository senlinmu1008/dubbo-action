package net.zhaoxiaobin.web;

import net.zhaoxiaobin.service.IDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxb
 * @date 2024-05-12 下午4:41
 */
@RestController
public class DubboController {
    private static final Logger logger = LoggerFactory.getLogger(DubboController.class);

    @DubboReference
    private IDubboService dubboService;

    @RequestMapping("/hello")
    public String hello(String name) {
        String result = dubboService.hello(name);
        logger.info("调用dubbo服务返回:{}", result);
        return result;
    }
}