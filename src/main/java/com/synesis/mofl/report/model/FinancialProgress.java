package com.synesis.mofl.report.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@EntityListeners(AuditingEntityListener.class)

//২০২১-২২ অর্থবছরে আগস্ট, ২০২১ পর্যন্ত সাব-সেক্টরভিত্তিক আর্থিক অগ্রগতি
public class FinancialProgress {
    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String organizationName;  //সংস্থার নাম
    @NotNull
    private  String projectNumber;   //প্রকল্প সংখ্যা
    @NotNull
    private  String adpTotal;   //এডিপি বরাদ্দ + মোট
    @NotNull
    private  String adpGob;   //এডিপি বরাদ্দ + জিওবি
    @NotNull
    private  String projectHelp;  //এডিপি বরাদ্দ+প্রকল্প সাহায্য
    @NotNull
    private  String gobObstacle;    //জিওবি অবমুক্ত (জিওবি বরাদ্দের %)
    @NotNull
    private  String financialProgressTotal;     //আর্থিক অগ্রগতি +মোট
    @NotNull
    private  String financialProgressBudget;    //আর্থিক অগ্রগতি   +বরাদ্দের %
    @NotNull
    private  String financialProgressGob;   //আর্থিক অগ্রগতি+জিওবি
    @NotNull
    private  String financialProgressProjectHelp;   //আর্থিক অগ্রগতি+প্রকল্প সাহায্য

    @NotNull
    private  String lastYearSameTimeProgressProjectPer;     //বিগত বছরের একই সময় পর্যন্ত অগ্রগতি+ %
    @NotNull
    private  String lastYearSameTimeProgressProjectNum;     //বিগত বছরের একই সময় পর্যন্ত অগ্রগতি+প্রকল্প সংখ্যা
    @NotNull
    private  String lastYearSameTimeProgressProjectExpense;     //বিগত বছরের একই সময় পর্যন্ত অগ্রগতি+ব্যয়




}
