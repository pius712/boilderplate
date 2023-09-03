package com.example.boilerplate.support.error;

import com.example.boilerplate.core.support.error.CoreExceptionType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CoreExceptionTypeTest {

    @Test
    void test() {
        CoreExceptionType exceptionType = CoreExceptionType.NOT_FOUND;

        Assertions.assertThat(exceptionType).isEqualTo("NOT_FOUND");
    }
}