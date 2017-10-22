package cn.xjtu.service;

import cn.xjtu.entity.Contact;
import cn.xjtu.exception.NameRepeatException;

import java.util.List;

public interface ContactService {
    public void addContact(Contact contact) throws NameRepeatException;
    public void updateContact(Contact contact);
    public void deleteContact(String id);
    public List<Contact> finaAll();
    public Contact findById(String id);
}
