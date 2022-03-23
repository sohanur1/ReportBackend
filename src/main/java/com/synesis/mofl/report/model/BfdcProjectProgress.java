package com.synesis.mofl.report.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// চলতি ২০২১-২২ অর্থ-বছরের  আগস্ট/২০২১ পর্যন্ত মন্ত্র্রণালয়, মৎস্য অধিদপ্তর, বিএফআরআই, বিএফডিসি এর প্রকল্পের এডিপি বাস্তবায়ন অগ্রগতি
public class BfdcProjectProgress {

    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String organization;    //সংস্থা(প্রকল্প সংখ্যা)


    @NotNull
    private String adpBudgetTotal;  //এডিপি বরাদ্দ +মোট

    @NotNull
    private String adpBudgetGob;    //এডিপি বরাদ্দ+জিওবি

    @NotNull
    private String adpBudgetProjectHelp;    //এডিপি বরাদ্দ +প্রকল্প সাহায্য

    @NotNull
    private String gobObstacleBudget;     //আগস্ট/২০২১  পর্যন্ত জিওবি অবমুক্ত(জিওবি বরাদ্দের%)

    @NotNull
    private String expenseTotal;        //আগস্ট/২০২১ পর্যন্ত ব্যয় (বরাদ্দের %)+মোট

    @NotNull
    private String expenseGob;      //আগস্ট/২০২১ পর্যন্ত ব্যয় (বরাদ্দের %)+জিওবি

    @NotNull
    private String expenseProjectHelp;  //আগস্ট/২০২১ পর্যন্ত ব্যয় (বরাদ্দের %)+প্রকল্প সাহায্য

}
