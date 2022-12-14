package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JavaNameValidatorTest {
    @Test
    void whenEmptyNameInvalid() {
        assertThat(JavaNameValidator.isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        assertThat(JavaNameValidator.isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(JavaNameValidator.isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(JavaNameValidator.isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertThat(JavaNameValidator.isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(JavaNameValidator.isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(JavaNameValidator.isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(JavaNameValidator.isNameValid("fir$t_u$er_1")).isTrue();
    }
}