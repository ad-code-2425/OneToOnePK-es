package com.example.hibernate.model;
// Generated 23 ene 2025, 16:27:48 by Hibernate Tools 6.6.0.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.math.BigDecimal;
// import java.sql.Date;
// import java.sql.Time;
// import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Tiposbasicos generated by hbm2java
 */
@Entity
@Table(name="tiposbasicos"
)
public class Tiposbasicos  implements java.io.Serializable {


     private int inte;
     private Long bigint1;
     private Short smallint1;
     private Float float1;
     private Character character1;
     private Byte byte1;
     private Boolean bit1;
     private String stri;
    //  private Date dateDate;
    //  private Time timeTime;
    //  private Timestamp dateTime2;

    private LocalDate dateDate;
     private LocalTime timeTime;
     private LocalDateTime dateTime2;


     private String texto;
     private byte[] binario;
     private BigDecimal bigDecimal;

    public Tiposbasicos() {
    }

	
    public Tiposbasicos(int inte) {
        this.inte = inte;
    }

    public Tiposbasicos(int inte, Long bigint1, Short smallint1, Float float1, Character character1, Byte byte1,
            Boolean bit1, String stri,
            LocalDate dateDate, LocalTime timeTime, LocalDateTime dateTime2, String texto, byte[] binario, BigDecimal bigDecimal) {
       this.inte = inte;
       this.bigint1 = bigint1;
       this.smallint1 = smallint1;
       this.float1 = float1;
       this.character1 = character1;
       this.byte1 = byte1;
       this.bit1 = bit1;
       this.stri = stri;
       this.dateDate = dateDate;
       this.timeTime = timeTime;
       this.dateTime2 = dateTime2;
       this.texto = texto;
       this.binario = binario;
       this.bigDecimal = bigDecimal;
    }
   
     @Id 

    
    @Column(name="inte", unique=true, nullable=false)
    public int getInte() {
        return this.inte;
    }
    
    public void setInte(int inte) {
        this.inte = inte;
    }

    
    @Column(name="bigint1")
    public Long getBigint1() {
        return this.bigint1;
    }
    
    public void setBigint1(Long bigint1) {
        this.bigint1 = bigint1;
    }

    
    @Column(name="smallint1")
    public Short getSmallint1() {
        return this.smallint1;
    }
    
    public void setSmallint1(Short smallint1) {
        this.smallint1 = smallint1;
    }

    
    @Column(name="float1", precision=12)
    public Float getFloat1() {
        return this.float1;
    }
    
    public void setFloat1(Float float1) {
        this.float1 = float1;
    }

    
    @Column(name="character1", length=1)
    public Character getCharacter1() {
        return this.character1;
    }
    
    public void setCharacter1(Character character1) {
        this.character1 = character1;
    }

    
    @Column(name="byte1")
    public Byte getByte1() {
        return this.byte1;
    }
    
    public void setByte1(Byte byte1) {
        this.byte1 = byte1;
    }

    
    @Column(name="bit1")
    public Boolean getBit1() {
        return this.bit1;
    }
    
    public void setBit1(Boolean bit1) {
        this.bit1 = bit1;
    }

    
    @Column(name="stri", length=255)
    public String getStri() {
        return this.stri;
    }
    
    public void setStri(String stri) {
        this.stri = stri;
    }

    //@Temporal(TemporalType.DATE)
    @Column(name="dateDate", length=10)
    public LocalDate getDateDate() {
        return this.dateDate;
    }
    
    public void setDateDate(LocalDate dateDate) {
        this.dateDate = dateDate;
    }

   // @Temporal(TemporalType.TIME)
    @Column(name="timeTime", length=8)
    public LocalTime getTimeTime() {
        return this.timeTime;
    }
    
    public void setTimeTime(LocalTime timeTime) {
        this.timeTime = timeTime;
    }

   // @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dateTime2", length=19)
    public LocalDateTime getDateTime2() {
        return this.dateTime2;
    }
    
    public void setDateTime2(LocalDateTime dateTime2) {
        this.dateTime2 = dateTime2;
    }

    
    @Column(name="texto", length=65535)
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }

    
    @Column(name="binario")
    public byte[] getBinario() {
        return this.binario;
    }
    
    public void setBinario(byte[] binario) {
        this.binario = binario;
    }

    
    @Column(name="bigDecimal", precision=19, scale=2)
    public BigDecimal getBigDecimal() {
        return this.bigDecimal;
    }
    
    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }




}


