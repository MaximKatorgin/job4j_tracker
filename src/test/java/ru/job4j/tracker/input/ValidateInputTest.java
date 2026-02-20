package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Input input = new MockInput(new String[]{"one", "1"});
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenCorrectInput() {
        Input input = new MockInput(new String[]{"2"});
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    void whenMultipleCorrectInput() {
        Input input = new MockInput(new String[]{"2", "3", "4"});
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(2);
        selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(3);
        selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(4);
    }

    @Test
    void whenNegativeInput() {
        Input input = new MockInput(new String[]{"-5"});
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Введите номер:");
        assertThat(selected).isEqualTo(-5);
    }

}