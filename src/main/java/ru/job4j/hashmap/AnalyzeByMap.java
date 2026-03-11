package ru.job4j.hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0D;
        int subjectsCount = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            subjectsCount += pupil.subjects().size();
        }
        return totalScore / subjectsCount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        double totalScore;
        for (Pupil pupil : pupils) {
            totalScore = 0D;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            result.add(new Label(pupil.name(), totalScore / pupil.subjects().size()));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> subjectsScore = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectsScore.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        for (Map.Entry<String, Integer> entry : subjectsScore.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        double totalScore;
        for (Pupil pupil : pupils) {
            totalScore = 0D;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            result.add(new Label(pupil.name(), totalScore));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        Map<String, Integer> subjectsScore = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectsScore.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        for (Map.Entry<String, Integer> entry : subjectsScore.entrySet()) {
            result.add(new Label(entry.getKey(), entry.getValue()));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}
