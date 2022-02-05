package com.dailycodebuffer.springboottutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long departmentId;
    @NotBlank(message = "please pass the department name")

    /*
     * @Length(max = 5,min =1)
     * 
     * @Size(max = 10, min = 0)
     * 
     * @Email
     * 
     * @Positive
     * 
     * @Negative
     * 
     * @PositiveOrZero
     * 
     * @NegativeOrZero
     * 
     * @Future
     * 
     * @FutureOrPresent
     * 
     * @Past
     * 
     * @PastOrPresent
     */
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    // public long getDepartmentId() {
    // return departmentId;
    // }

    // public void setDepartmentId(long departmentId) {
    // this.departmentId = departmentId;
    // }

    // public String getDepartmentName() {
    // return departmentName;
    // }

    // public void setDepartmentName(String departmentName) {
    // this.departmentName = departmentName;
    // }

    // public String getDepartmentAddress() {
    // return departmentAddress;
    // }

    // public void setDepartmentAddress(String departmentAddress) {
    // this.departmentAddress = departmentAddress;
    // }

    // public String getDepartmentCode() {
    // return departmentCode;
    // }

    // public void setDepartmentCode(String departmentCode) {
    // this.departmentCode = departmentCode;
    // }

    // public Department(long departmentId, String departmentName, String
    // departmentAddress, String departmentCode) {
    // this.departmentId = departmentId;
    // this.departmentName = departmentName;
    // this.departmentAddress = departmentAddress;
    // this.departmentCode = departmentCode;
    // }

    // public Department() {

    // }

    // @Override
    // public String toString() {
    // return "Department [departmentAddress=" + departmentAddress + ",
    // departmentCode=" + departmentCode
    // + ", departmentId=" + departmentId + ", departmentName=" + departmentName +
    // "]";
    // }

}
