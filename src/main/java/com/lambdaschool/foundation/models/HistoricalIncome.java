package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "historicalincome")
public class HistoricalIncome extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long incid;

    @NotNull
    private int year;

    @NotNull
    private int individualincome;

    @NotNull
    private int householdincome;

    @ManyToOne
    @JoinColumn(name = "cityid")
    @NotNull
    @JsonIgnore
    private City city;

    public HistoricalIncome()
    {
    }

    public HistoricalIncome(
        @NotNull int year,
        @NotNull int individualincome,
        @NotNull int householdincome,
        @NotNull City city)
    {
        this.year = year;
        this.individualincome = individualincome;
        this.householdincome = householdincome;
        this.city = city;
    }

    public long getIncid()
    {
        return incid;
    }

    public void setIncid(long incid)
    {
        this.incid = incid;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getIndividualincome()
    {
        return individualincome;
    }

    public void setIndividualincome(int income)
    {
        this.individualincome = income;
    }

    public int getHouseholdincome()
    {
        return householdincome;
    }

    public void setHouseholdincome(int householdincome)
    {
        this.householdincome = householdincome;
    }

    public City getCity()
    {
        return city;
    }

    public void setCity(City city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "HistoricalIncome{" +
            "year=" + year +
            ", individualincome=" + individualincome +
            ", householdincome=" + householdincome +
            '}';
    }
}
