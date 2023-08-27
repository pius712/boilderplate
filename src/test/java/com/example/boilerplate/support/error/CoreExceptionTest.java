package com.example.boilerplate.support.error;

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
            throw new CoreException(CoreExceptionType.MEETING_NOT_FOUND);
        }
    }
}