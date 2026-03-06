package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DepDescCompTest {

    @Test
    void compare() {
        int result = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    void whenUpDepartmentGoBefore() {
        int result = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenAsc() {
        int result = new DepDescComp().compare(
                "K2/SK1/SSK1",
                "K1/SK1/SSK2"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    void whenFirstDepartmentIsDifferentThenDesc() {
        int result = new DepDescComp().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertThat(result).isGreaterThan(0);
    }

}