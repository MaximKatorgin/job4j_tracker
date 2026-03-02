package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodWithExitingCitizen() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen diplicateCitizen = new Citizen("2f44a", "Ivanov Ivan");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(diplicateCitizen)).isFalse();
    }
}