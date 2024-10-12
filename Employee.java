package com.example.ESS.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empinfo")
@Getter
@Setter
public class Employee {

    @Column(name = "sno")
    private Integer sno;

    @Id
    @Column(name = "emp_no")
    private Integer empNo;

    @Column(name = "section")
    private String section;

    @Column(name = "name")
    private String name;

    @Column(name = "total_paid_days")
    private Integer totalPaidDays;

    @Column(name = "work_order_rate")
    private Double workOrderRate;

    @Column(name = "total_bill_amount")
    private Double totalBillAmount;

    @Column(name = "wages_per_day")
    private Double wagesPerDay;

    @Column(name = "basic")
    private Integer basic;

    @Column(name = "fda")
    private Double fda;

    @Column(name = "wages")
    private Double wages;

    @Column(name = "pf")
    private Double pf;

    @Column(name = "esi")
    private Double esi;

    @Column(name = "safety_shoe")
    private String safetyShoe;

    @Column(name = "bus_token")
    private String busToken;

    @Column(name = "t_sert")
    private String tSert;

    @Column(name = "advance")
    private String advance;

    @Column(name = "total_deduction")
    private Double totalDeduction;

    @Column(name = "net_salary")
    private Integer netSalary;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_no")
    private Long accountNo;

    @Column(name = "ifsc_code")
    private String ifscCode;

}
