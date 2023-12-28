package com.reststudy.suno.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity(name = "user_details")
public class User {
    protected User(){};   // 기본 생성자를 생성해주지 않으면 JPA에서 에러가 발생함(웹과 DB연결 시 에러 발생)

    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 2, message = "이름은 최소 2자 이상으로 입력하세요.")
//    @JsonProperty("user_name")
    private String name;
    @Past(message = "과거 날짜로 입력하세요.")
//    @JsonProperty("birth_date")
    private LocalDate birthDate;

    public User(Integer id, String name, LocalDate birthDate) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
    }

}

