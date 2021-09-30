package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String name;
    private String color;
    private Integer age;

    //creating empty constructor
    public Gato() {
    }

    //creating constructor
    public Gato(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    //creating getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //creating equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(name, gato.name) && Objects.equals(color, gato.color) && Objects.equals(age, gato.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    //creating to String
    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
