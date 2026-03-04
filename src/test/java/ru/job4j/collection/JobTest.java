package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {

    @Test
    void whenJobAscByName() {
        Job first = new Job("first", 1);
        Job second = new Job("second", 1);

        Comparator<Job> comparator = new JobAscByName();
        assertThat(comparator.compare(first, second)).isLessThan(0);
    }

    @Test
    void whenJobDescByName() {
        Job first = new Job("first", 1);
        Job second = new Job("second", 1);

        Comparator<Job> comparator = new JobDescByName();
        assertThat(comparator.compare(first, second)).isGreaterThan(0);
    }

    @Test
    void whenJobDescByPriority() {
        Job first = new Job("first", 1);
        Job second = new Job("second", 2);

        Comparator<Job> comparator = new JobDescByPriority();
        assertThat(comparator.compare(first, second)).isGreaterThan(0);
    }

    @Test
    void whenJobAscByPriority() {
        Job first = new Job("first", 1);
        Job second = new Job("second", 0);

        Comparator<Job> comparator = new JobAscByPriority();
        assertThat(comparator.compare(first, second)).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

}