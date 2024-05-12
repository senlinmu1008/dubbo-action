package net.zhaoxiaobin.service;

/**
 * dubbo测试service接口
 *
 * @author zhaoxb
 * @date 2024-05-09 下午6:58
 */
public interface IDubboService {
    /**
     * 公共api接口，输出hello + name
     *
     * @param name
     * @return
     */
    String hello(String name);
}
