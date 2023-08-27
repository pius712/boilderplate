package com.example.boilerplate.support.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoreExceptionTypeTest {

    @Test
    void test() {
        CoreExceptionType exceptionType = CoreExceptionType.MEETING_NOT_FOUND;

        Assertions.assertThat(exceptionType).isEqualTo("hi");
    }
}