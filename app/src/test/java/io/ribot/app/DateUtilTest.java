package io.ribot.app;

import org.junit.Test;

import java.util.Date;

import io.ribot.app.util.DateUtil;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DateUtilTest {

    @Test
    public void isTodayTrue() {
        assertTrue(DateUtil.isToday(new Date().getTime()));
    }

    @Test
    public void isTodayFalse() {
        assertFalse(DateUtil.isToday(new Date().getTime() - 24 * 60 * 60 * 100));
    }
}
