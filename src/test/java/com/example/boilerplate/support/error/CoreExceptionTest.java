package com.example.boilerplate.support.error;

import com.example.boilerplate.core.support.error.CoreException;
import com.example.boilerplate.core.support.error.CoreExceptionType;
import com.example.boilerplate.core.support.error.TypeException;
import org.junit.jupiter.api.Test;

class CoreExceptionTest {

    @Test
    void test() {
        TestSut sut = new TestSut();

        try {
            sut.foo();
        } catch (TypeException e) {
            System.out.println(e.exceptionType.getHttpStatus());
            System.out.println(e.exceptionType.getErrorCode());
        }

    }

    static class TestSut {
        public void foo() {
            throw new CoreException(CoreExceptionType.NOT_FOUND);
        }
    }
}