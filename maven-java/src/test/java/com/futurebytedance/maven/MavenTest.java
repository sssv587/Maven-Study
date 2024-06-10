package com.futurebytedance.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2024/6/10 - 14:36
 * @Description
 */

public class MavenTest {
    @Test
    public void testAssert() {
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a + b, 30);
    }
}
