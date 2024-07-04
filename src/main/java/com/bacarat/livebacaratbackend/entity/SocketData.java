package com.bacarat.livebacaratbackend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "SOCKET_DATE")
public class SocketData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SOCKET")
    private Long id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
