package com.example.bd;

import com.example.entity.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class BD {
    private static Map<Integer, Student> studentMap;

    private static Map<Integer, Course> courseMap;

    private static Map<Integer, Teacher> teacherMap;

    private static Map<Integer, Result> resultMap;

    private static Map<Integer, Task> taskMap;

    public static void addStudent(int key, Student student) {
        studentMap.put(key, student);
    }

    public static void addCourse(int key, Course course) {
        courseMap.put(key, course);
    }

    public static void addTeacher(int key, Teacher teacher) {
        teacherMap.put(key, teacher);
    }

    public static void addResult(int key, Result result) {
        resultMap.put(key, result);
    }

    public static void addTask(int key, Task task) {
        taskMap.put(key, task);
    }

    public static Integer generateIdCourse() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if (courseMap == null || !courseMap.containsKey(i)){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Integer generateIdResult() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!resultMap.containsKey(i)) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Integer generateIdStudent() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!studentMap.containsKey(i)) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Integer generateIdTask() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!taskMap.containsKey(i)) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Integer generateIdTeacher() {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!teacherMap.containsKey(i)) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
