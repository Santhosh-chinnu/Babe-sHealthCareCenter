package com.pack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@Entity
@Table(name="babes")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Babes {
@Id
@SequenceGenerator(name="gen1" ,sequenceName = "babe_no_seq",initialValue = 14578,allocationSize = 1)
@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
private Integer bid;
@Column(length = 50)
@NonNull
private String name;
@Column(length = 50)
@NonNull
private String address;
@NonNull
private Double years;

}
